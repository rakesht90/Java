package udemy.datastructures.binarytree;

import java.util.List;

/**
 * <p>Implementation of BinaryTree Data Structure</p>
 * <p>Elements to the left are smaller than the root</p>
 * <p>Elements to the right are greater than the root</p>
 * 
 * @author Marcos
 */
public class TreeNode {

	public int root;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int root) {
		this.root = root;
	}
	
	public void addNode(int newRoot) {
		if (newRoot < root){
			if (left == null) left = new TreeNode(newRoot);
			else left.addNode(newRoot);
		} else {
			if (right == null) right = new TreeNode(newRoot);
			else right.addNode(newRoot);
		}
	}
	
	public void preOrderTraversal(List<Integer> list) {
		if (left != null) left.preOrderTraversal(list);
		list.add(root);
		if (right != null) right.preOrderTraversal(list);
	}
	
	public void postOrderTraversal(List<Integer> list) {
		if (right != null) right.postOrderTraversal(list);
		list.add(root);
		if (left != null) left.postOrderTraversal(list);
	}
	
	
}
