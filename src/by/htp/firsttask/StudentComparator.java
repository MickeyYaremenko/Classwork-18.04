package by.htp.firsttask;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getSecondName().compareTo(o2.getSecondName()) != 0) {
			return o1.getSecondName().compareTo(o2.getSecondName());
		} else if (o1.getFirstName().compareTo(o2.getFirstName()) != 0) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		} else {
			return o1.getMidName().compareTo(o2.getMidName());
		}
	}

}
