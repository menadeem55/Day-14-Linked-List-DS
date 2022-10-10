package com.ds;

import java.util.*;

public class LinkedList {

	Node head;

	class Node {

		Object data;
		Node ref;

		Node(Object data) {

			this.data = data;
		}
	}

	public void addFirst(Object data)

	{
		Node newNode = new Node(data);
		newNode.ref = head;
		head = newNode;
	}

	public void addLast(Object data) {

		Node newNode = new Node(data);
		Node temp = head;
		if (head == null)
			head = newNode;
		else {
			while (temp.ref != null) {
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}

	public void addAtPosition(Object data, int position) {
		int index = 0;
		Node newNode = new Node(data);
		Node left = head;
		Node right = left.ref;

		while (index < (position - 1)) {

			left = left.ref;
			right = right.ref;
			index++;
			
		}
		newNode.ref = right;
		left.ref = newNode;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {

			if (temp.ref != null)
				System.out.print(temp.data + " => ");
			else
				System.out.println(temp.data);
			temp = temp.ref;
		}
	}

			public void deleteFirst() 
			{
				head = head.ref;
			}
			
			public void deleteLast() 
			{
				if(head == null)
					System.out.println("Linked list is Empty");
				else if(head.ref == null)
					head = null;
				else
				{
					Node temp = head;
					while(temp.ref.ref != null)
					{
						temp = temp.ref;
					}
					temp.ref = null;
				}
			}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Welcome to LinkedList Programming");
		Scanner sc = new Scanner(System.in);

		list.addFirst(56);
		list.display();
		list.addLast(70);
		list.display();

		System.out.println("Enter position at which you want to add: ");
		int position = sc.nextInt();
		list.addAtPosition(30, position);
		list.display();

		list.deleteLast();
		list.display();
		list.deleteFirst();
		list.display();

	}

}
