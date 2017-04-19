package by.htp.thirdfourthtask;

import java.util.HashSet;
import java.util.TreeSet;

import by.htp.firsttask.Student;
import by.htp.firsttask.StudentComparator;
import by.htp.secondtask.StHashSet;

public class HashSetSort {

	public static void main(String[] args) {
		HashSet<Student> stSet = StHashSet.init();

		TreeSet<Student> stTree = new TreeSet<>(new StudentComparator());

		stTree.addAll(stSet);

		System.out.println(stTree.toString()); // third task

		TreeSet<Student> stTreeTemp = new TreeSet<>(new StudentComparator());

		int counter = 1;

		System.out.println("Printing every even student:");
		for (Student st : stTree) {
			if (counter % 2 == 0) {
				System.out.print(st);
				stTreeTemp.add(st);
				counter++;
			} else {
				counter++;
			}

		}

		stTree = stTreeTemp;

		System.out.println("TreeSet without odd students:");
		System.out.println(stTree.toString()); // fourth task

	}

}
