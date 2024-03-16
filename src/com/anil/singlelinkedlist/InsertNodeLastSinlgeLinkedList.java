package com.anil.singlelinkedlist;

public class InsertNodeLastSinlgeLinkedList {

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
		System.out.print("null");
	}

	public void insertLast(int value) {

		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;

	}

	public static void main(String[] args) {

		InsertNodeLastSinlgeLinkedList insertNodeLastSinlgeLinkedList = new InsertNodeLastSinlgeLinkedList();

		insertNodeLastSinlgeLinkedList.insertLast(11);
		insertNodeLastSinlgeLinkedList.insertLast(8);
		insertNodeLastSinlgeLinkedList.insertLast(1);
		insertNodeLastSinlgeLinkedList.insertLast(10);
		insertNodeLastSinlgeLinkedList.display();
	}

}
