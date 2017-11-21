public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insertFirst(String data) {
		Node newNode = new Node();
		newNode.record = data;
		newNode.next = head;
		head = newNode;
	}
	
	public void deleteFirst() {
		head = head.next;
	}
	
	public void insertAfter(String data, Node after) {
		if (after != null) {
			Node newNode = new Node();
			newNode.record = data;
			Node temp = after.next;
			after.next = newNode;
			newNode.next = temp;
		}
	}
	
	public Node findNode(String data) {
		Node pointer = head;
		Node answer = null;
		while (pointer != null) {
			if (pointer.record.equals(data)) {
				answer = pointer;
			}
			pointer = pointer.next;
		}
		return answer;
	}
	
	public void deleteNode(Node trash) {
		Node pointer = head;
		if (trash != null) {
			while (pointer.next != trash) {
				pointer = pointer.next;
			}
			pointer.next = pointer.next.next;
		}
	}
	
	public void insertLast(String data) {
		Node pointer = head;
		Node newNode = new Node();
		newNode.record = data;
		if (head == null) {
			head = newNode;
			newNode.next = null;
		} else {
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode; 
			newNode.next = null;
		}
	}

	public void deleteLast() {
		Node pointer = head;
		while (pointer.next.next != null) {
			pointer = pointer.next;
		}
		pointer.next = null;
	}
	
	public void traverseAndPrint() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}
	
}