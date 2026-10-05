package com.iostream;

import com.iostream.PreOrderTraverse.Node;
import java.util.*;

public class LevelOrderTraverse {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;

		}

	}

	static int idx = -1;

	public static Node buildTree(int nodes[]) {
		idx++;
		if (nodes[idx] == -1) {
			return null;
		}
		Node newNode = new Node(nodes[idx]);
		newNode.left = buildTree(nodes);
		newNode.right = buildTree(nodes);

		return newNode;

	}
	public static Node levelOrder(Node root)
	{
		Queue<Node>=new LinkedList<>();
		
	}

	

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6,-1,-1 };
		
		//Node root=levelOrderTraverse.buildTree(nodes);
		//levelOrder(root);
		
		
	}


	

}
