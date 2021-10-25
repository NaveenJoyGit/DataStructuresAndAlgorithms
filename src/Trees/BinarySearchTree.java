package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

	class Node {
		Integer value;
		Node left;
		Node right;
		
		Node() {
			
		}
		
		Node(int value) {
			this.value = value;
		}
	}
	
	Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	public BinarySearchTree insert(int value) {
		Node newNode = new Node(value);
		if(this.root == null) {
			this.root = newNode;
			return this;
		}
		Node current = this.root;
		while(true) {
			// This BinarySearchTree does not accept duplicates hence returning null
			if(value == current.value) return null;
			if(value < current.value) {
				if(current.left == null) {
					current.left = newNode;
					return this;
				}
				current = current.left;
			}
			else if(value > current.value) {
				if(current.right == null) {
					current.right = newNode;
					return this;
				}
				current = current.right;
			}
		}
	}
	
	public Boolean find(int value) {
		if(this.root == null) return false;
		Node c = this.root;
		Boolean found = false;
		while(c != null && !found) {
			if(value < c.value) {
				c = c.left;
			}
			else if (value > c.value) {
				c = c.right;
			}
			else {
				found = true;
			}
		}
		return found;
	}
	
	List<Integer> BFS() {
		Queue<Node> bstQ = new LinkedList<Node>();
		Node node = this.root;
		List<Integer> data = new ArrayList<>();
		bstQ.add(node);
		while(!bstQ.isEmpty()) {
			node = bstQ.poll();
			data.add(node.value);
			if(node.left != null) bstQ.add(node.left);
			if(node.right != null) bstQ.add(node.right);
		}
		return data;
	}
	
	List<Integer> DFS(String order) {
		List<Integer> data = new ArrayList<>();
		Node node = this.root;
		switch(order) {
			case "inOrder":
				traverseInOrder(node, data);
				break;
			case "preOrder":
				traversePreOrder(node, data);
				break;
			case "postOrder":
				traversePostOrder(node, data);
				break;
			default:
				break;			
		}
		return data;
	}

	private void traversePreOrder(Node node, List<Integer> data) {
		data.add(node.value);
		if(node.left != null)
			traversePreOrder(node.left, data);
		if(node.right != null)
			traversePreOrder(node.right, data);
	}
	
	private void traversePostOrder(Node node, List<Integer> data) {
		if(node.left != null)
			traversePostOrder(node.left, data);
		if(node.right != null)
			traversePostOrder(node.right, data);
		data.add(node.value);
	}
	

	private void traverseInOrder(Node node, List<Integer> data) {
		if(node.left != null)
			traverseInOrder(node.left, data);
		data.add(node.value);
		if(node.right != null)
			traverseInOrder(node.right, data);
	}

	
}
