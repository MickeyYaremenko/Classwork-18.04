package by.htp.firsttask;

import java.util.LinkedList;

public class StLinkedList {
	public static void main(String[] args) {
		Student firstStudent = new Student("Alex", "Smith", "Alexovich");
		Student secondStudent = new Student("Ben", "Baker", "Benovich");
		Student thirdtudent = new Student("Colin", "Writer", "Colinovich");
		LinkedList<Student> stLinkedList = new LinkedList<>();

		stLinkedList.add(firstStudent);
		stLinkedList.add(secondStudent);
		stLinkedList.add(thirdtudent);

		System.out.println(stLinkedList.toString());

		stLinkedList.remove(1);

		System.out.println(stLinkedList.toString());
	}
}
