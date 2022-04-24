import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class MerkleTree {
	
	// A list of transaction
	List<String> ChildList;
	
	// Merkle Root
	String root;

	
	public MerkleTree(List<String> ChildList) {
		this.ChildList = ChildList;
		root = "";
	}

	public void merkle_tree() {
		List<String> tempChildList = new ArrayList<String>();

		for (int i = 0; i < this.ChildList.size(); i++) {
			tempChildList.add(this.ChildList.get(i));
		}

		List<String> newChildList = getNewChildList(tempChildList);
		while (newChildList.size() != 1) {
			newChildList = getNewChildList(newChildList);
		}

		this.root = newChildList.get(0);
	}

	private List<String> getNewChildList(List<String> tempChildList) {

		List<String> newChildList = new ArrayList<String>();
		int index = 0;
		while (index < tempChildList.size()) {
			// left
			String left = tempChildList.get(index);
			index++;

			// right
			String right = "";
			if (index != tempChildList.size()) {
				right = tempChildList.get(index);
			}

			// sha2 hex value
			String sha2HexValue = getSHA2HexValue(left + right);
			newChildList.add(sha2HexValue);
			index++;

		}

		return newChildList;
	}

	/**
	 * Return hex string
	 */
	public String getSHA2HexValue(String str) {
		byte[] cipher_byte;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(str.getBytes());
			cipher_byte = md.digest();
			StringBuilder sb = new StringBuilder(2 * cipher_byte.length);
			for (byte b : cipher_byte) {
				sb.append(String.format("%02x", b & 0xff));
			}
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "";
	}

	//Get root/ Top hash
	public String getRoot() {
		return this.root;
	}

}
