package Trees;

public class Main {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(12);
		bst.insert(7);
		bst.insert(1);
		bst.insert(67);
		bst.insert(45);
		bst.insert(4);
//		bst.insert(0);
		String result = bst.find(0) ? "PASS" : "FAIL";
		System.out.println(result);
		System.out.println(bst.BFS());
	}

}
