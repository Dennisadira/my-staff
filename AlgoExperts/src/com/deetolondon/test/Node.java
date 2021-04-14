package com.deetolondon.test;

import java.util.HashSet;
import java.util.Stack;

public class Node {

	Node left, right;
	int data;

	public Node(int data) {

		this.data = data;

	}

	public void insert(int value) {

		// if value< data place it on the left
		if (value < data) {
			if (left == null) {

				left = new Node(value);
			} else {

				left.insert(value);
			}

		} else {

			if (right == null) {

				right = new Node(value);

			} else {
				right.insert(value);

			}

		}

	}
	
	public boolean contains(int value ) {
		
		if (value == data) {
			return true;
		}
		
		
	if (value < data) {	
		if(left == null) {
			
			return false;
			
		}else {
			
			return left.contains(value);
			
		}
	}
	else {
		
if(right == null) {
			
			return false;
			
		}else {
			
			return right.contains(value);
			
		}
		
	}
}
	
	
	public void prindInorder() {
		
		if (left != null) 
			left.prindInorder();
		
		System.out.println(data);
		
		
		if (right !=null)
			right.prindInorder();
		
		
	}
	
	
	public static void main(String [] args) {
		Node testnode = new Node(10);
		
		testnode.insert(5);
		
		testnode.insert(8);
		
		testnode.insert(4);
		
		testnode.insert(40);
		
		testnode.insert(9);
		
		System.out.print(testnode.contains(4));
		
		testnode.prindInorder();
		
		
	}
	
	
	public void dfs(Node start) {
		
		//create stack LIFO
		//create hash for seen charectors
		//add the node the stack
		//pop the stack add to seen hashset
		//process the node 
		//add the adjacent nodes to to the stack
		
		
		Stack<Node> data= new Stack<>();
		
		HashSet<Node> seen = new HashSet<>();
		
		data.push(start);
		
		Node currentNode =  data.pop();
		
		if (!seen.contains(currentNode)){
			
			seen.add(currentNode);	
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}
