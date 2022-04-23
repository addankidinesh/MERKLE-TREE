import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<String> tempTxList = new ArrayList<String>();
		tempTxList.add("Mumbai Indians");
		tempTxList.add("are");
		tempTxList.add("5");
		tempTxList.add("Times");
		tempTxList.add("Champions");
        tempTxList.add("of IPL");

		MerkleTree merkleTrees = new MerkleTree(tempTxList);
		merkleTrees.merkle_tree();
		System.out.println("root : " + merkleTrees.getRoot());
	}
}
