package com.anil.singlelinkedlist;

import java.util.NoSuchElementException;

import javax.naming.NameNotFoundException;

public class InsertNodeBegSinlgeLinkedList {
	
	/*
	 * @author Anil
	 * @see SingleLinkedList
	 */

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}

	public void insert(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;

	}

	public ListNode deleteFirst() throws NameNotFoundException {
		if (head == null) {
			throw new NoSuchElementException("data Not Found");
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	public static void main(String[] args) throws NameNotFoundException {
		InsertNodeBegSinlgeLinkedList insll = new InsertNodeBegSinlgeLinkedList();

		insll.insert(11);
		insll.insert(8);
		insll.insert(1);
		insll.insert(4);

		insll.display();
		System.out.println(insll.deleteFirst().data);
		insll.display();
		
		System.out.println(insll.deleteFirst().data);
		insll.display();
		
		System.out.println(insll.deleteFirst().data);
		insll.display();
		
		System.out.println(insll.deleteFirst().data);
		insll.display();
		
		System.out.println(insll.deleteFirst().data);
		insll.display();
		
		
		
	}

}
