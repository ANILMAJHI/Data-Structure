package com.anil.singlelinkedlist;

public class InsertNodePositionSLL {

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

	public void insertposition(int position, int value) {

		// 1-->4-->5-->null
		// 1-->6-->4-->5-->null
		ListNode node = new ListNode(value);
		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous.next = previous;
				count++;

			}
			ListNode current = previous.next;
			node.next = current;

			previous.next = node;
		}
	}

	public static void main(String[] args) {

		InsertNodePositionSLL isll = new InsertNodePositionSLL();
		isll.insertposition(1, 4);
		isll.insertposition(2, 5);
		//isll.insertposition(3, 6);
		isll.insertposition(3, 7);
		isll.display();
	}

}
