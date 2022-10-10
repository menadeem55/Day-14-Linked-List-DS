package com.ds;

import java.util.*;

public class LinkedList {

	Node head;
	class Node 
	
	{
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
			
			public Object searhElement(Object input)
			{
				
			Node temp = head;
			int index = 0;
			while(temp != null)
			{
				index++;
				if(temp.data == input)
				{
					String result = temp.data+" element found at index " +index;
					return result;
				}
				temp = temp.ref;
			}
			return null;
		}
			
			public void insertElement(Object input, Object value)
			{
				
					Node newNode = new Node(value);
					Node temp = head;
					int index = 0;
					
						while(temp.data != input)
						{
							index++;
							temp = temp.ref;
						}
						Node left = head;
						Node right = left.ref;
						int index1 = 0;
						
						while(index < index)
						{
							index++;
							left = left.ref;
							right = right.ref;
						
						
					}
					newNode.ref = right;
					left.ref = newNode;
					
			}
			public void deleteSpecificPosition(Object data)
			{
				int index = 0;
				Node left = head;
				Node right = left.ref;
				while(right.data != data)
				{
						left = left.ref;
						right = right.ref;
						index++;
					
				}
				left.ref = right.ref;
			}

			public static void main(String[] args) {
				LinkedList list = new LinkedList();
				System.out.println("Welcome to Linked List Problem");
				
				
				list.addFirst(56);
				list.addLast(30);
				list.addLast(40);
				list.addLast(70);
				list.display();
		
				
				list.deleteSpecificPosition(40);
				list.display();
			}
		}