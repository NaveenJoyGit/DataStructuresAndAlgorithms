package Trees;

import java.util.List;

public class BFSAndDFS {
	
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(10);b.insert(6);b.insert(3); b.insert(8);b.insert(15);b.insert(20);
		List<Integer> bfs = b.BFS();
		System.out.println(bfs + "-> BFS");
		System.out.println(b.DFS("preOrder") + "-> preOrder");
		System.out.println(b.DFS("postOrder") + "-> postOrder");
		System.out.println(b.DFS("inOrder") + "-> inOrder");
		
	}
	
	

}
