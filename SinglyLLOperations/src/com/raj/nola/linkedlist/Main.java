package com.raj.nola.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentLinkedList linkedList = new StudentLinkedList();

		linkedList.addToFront(new Student("Dennis", "Haar", 100));
		linkedList.addToFront(new Student("Justin", "Davis", 101));
		linkedList.addToFront(new Student("Martin", "Ford", 102));
		linkedList.addToFront(new Student("Henry", "Grace", 103));

		linkedList.printList();

		linkedList.removeFromFront();

	}

}
