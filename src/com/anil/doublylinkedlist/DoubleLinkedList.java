package com.anil.doublylinkedlist;

public class DoubleLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public  ListNode(int data) {
			this.data = data;

		}

	}

	public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;

	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}
	
	public void insert(int value)
	{
		ListNode newNode=new ListNode(value); 
		newNode.next=head;
		head=newNode;
	}

	public void displayForward() {
		if (head == null) {
			return;
		}
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;

		}
		System.out.println("null");
	}

	public void displayBackword() {
		if (tail == null) {
			return;
		}
		
		ListNode temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.previous;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		DoubleLinkedList dll=new DoubleLinkedList();
		dll.insert(1);
		dll.insert(4);
		dll.insert(8);
		dll.insert(10);
		
		dll.displayForward();
		dll.displayBackword();
		
		
	}

}
