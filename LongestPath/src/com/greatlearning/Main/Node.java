package com.greatlearning.Main;
import java.util.ArrayList;

public class Node {

	int data;
	Node left, right;
	
	Node(int data) {
		this.data = data;
	}
}

 class LongestPath {
	ArrayList<Integer> findLongestPath(Node root) {
		if (root == null) {
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> left = findLongestPath(root.left);
		ArrayList<Integer> right = findLongestPath(root.right);
		
		if (left.size() >= right.size()) {
			left.add(root.data);
		} else {
			right.add(root.data);
		}
		
		return left.size() >= right.size() ? left : right;
	}
	
	public static void main(String[] args) {
		Node root = new Node(100);
		root.left = new Node(20);
		root.right = new Node(130);
		root.left.left = new Node(10);
		root.left.right = new Node(50);
		root.right.left = new Node(110);
		root.right.right = new Node(140);
		root.left.left.left = new Node(5);
		
		LongestPath longestPath = new LongestPath();
		ArrayList<Integer> result = longestPath.findLongestPath(root);
		
		System.out.print("Longest path in tree => ");
		
		for (int i = result.size() - 1; i >= 0; i--) {
			System.out.print(result.get(i) + "\t");
		}
	}	
}