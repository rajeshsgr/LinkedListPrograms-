package com.raj.nola.linkedlist;

public class StudentLinkedList {

	private StudentNode head;
	private int size;

	public void addToFront(Student student) {

		StudentNode node = new StudentNode(student);

		node.setNext(head);

		head = node;

		size++;

	}

	public void removeFromFront() {

		if (isListEmpty()) {

			System.out.println("List is Empty");

		} else {

			StudentNode node = head;

			head = head.getNext();

			node.setNext(null);

			size--;

		}

	}

	public void printList() {

		StudentNode currentNode = head;

		while (currentNode != null) {

			System.out.print((currentNode.getStudent()));
			System.out.print("-->");
			currentNode = currentNode.getNext();
		}
		System.out.print("NULL");

	}

	public int getListSize() {

		return size;
	}

	public boolean isListEmpty() {

		return (head == null);
	}

}
