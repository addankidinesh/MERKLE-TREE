import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<String> ChildList = new ArrayList<String>();
		ChildList.add("Mumbai Indians");
		ChildList.add("are");
		ChildList.add("5");
		ChildList.add("Times");
		ChildList.add("Champions");
        ChildList.add("of IPL");
		MerkleTree merkleTrees = new MerkleTree(ChildList);
		merkleTrees.merkle_tree();
		System.out.println("Hash of root or whole tree :");
		System.out.println(merkleTrees.getRoot());
	}
}
