package com.ds;

public class LinkedList {

	Node head;

	class Node {

		Object data;
		Node ref;

		Node(Object data) {

			this.data = data;
		}
	}

	public void elements(Object data) {
		Node newNode = new Node(data);
		System.out.println(newNode.data + " ");
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		System.out.println("Welcome to LinkedList Programming");
		list.elements(56);
		list.elements(30);
		list.elements(70);

	}

}
