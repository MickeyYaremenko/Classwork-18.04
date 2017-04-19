package by.htp.secondtask;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import by.htp.firsttask.Student;

public class StHashSet {
	
	public static void main(String[] args) {
		HashSet<Student> stHashSet = init();
		
		for (Student st: stHashSet){
			if (st.getFirstName().toLowerCase().charAt(0) == 'a'){
				System.out.print(st);
			}
		}
		
	}
	
	public static HashSet<Student> init(){
		HashSet<Student> stHashSet = new HashSet<>();
		
		Student firstStudent = new Student("Alex", "Smith", "Alexovich");
		Student secondStudent = new Student("Ben", "Baker", "Benovich");
		Student thirdStudent = new Student("Colin", "Writer", "Colinovich");
		Student fourthStudent = new Student("Jack", "Anderson", "Jackovich");
		Student fifthStudent = new Student("Harry", "Aldridge", "Harryvich");
		Student sixthtudent = new Student("Charlie", "Kingsman", "Charlievich");
		Student seventhStudent = new Student("Archie", "Larkins", "Archievich");
		Student eighthStudent = new Student("Ben", "Baker", "Benovich");//
		Student ninthtudent = new Student("Alice", "Howard", "Brucovna");
		Student tenthStudent = new Student("Lilly", "Bargeman", "Alexovna");
		Student eleventhStudent = new Student("Evelyn", "Mansfield", "Benovna");
		Student twelfthStudent = new Student("Colin", "Writer", "Colinovich");//
		Student therteenthStudent = new Student("David", "Marshman", "Alexovich");
		Student fifteenthStudent = new Student("Emma", "Miller", "Benovna");
		Student sixteenthStudent = new Student("Rose", "Carroll", "Colinovna");
		Student seventeenthStudent = new Student("Alex", "Smith", "Alexovich");//
		Student eighteenthStudent = new Student("May", "Bishop", "Benovna");
		Student nineteenthtudent = new Student("Amy", "Miln", "Colinovna");
		Student twentiethStudent = new Student("Alex", "Smith", "Alexovich");//
		Student twentyFirstStudent = new Student("Hollie", "Longman", "Benovich");
		Student twentySecondStudent = new Student("Robert", "Murphy", "Colinovich");
		Student twentyThirdStudent = new Student("Colin", "Writer", "Colinovich");//
		Student twentyFourthStudent = new Student("Rory", "Nathan", "Colinovich");
		Student twentyFifthStudent = new Student("Colin", "Writer", "Colinovich");//
		
		stHashSet.add(firstStudent);
		stHashSet.add(secondStudent);
		stHashSet.add(thirdStudent);
		stHashSet.add(fourthStudent);
		stHashSet.add(fifthStudent);
		stHashSet.add(sixthtudent);
		stHashSet.add(seventhStudent);
		stHashSet.add(eighthStudent);
		stHashSet.add(ninthtudent);
		stHashSet.add(tenthStudent);
		stHashSet.add(eleventhStudent);
		stHashSet.add(twelfthStudent);
		stHashSet.add(therteenthStudent);
		stHashSet.add(fifteenthStudent);
		stHashSet.add(sixteenthStudent);
		stHashSet.add(seventeenthStudent);
		stHashSet.add(eighteenthStudent);
		stHashSet.add(nineteenthtudent);
		stHashSet.add(twentiethStudent);
		stHashSet.add(twentyFirstStudent);
		stHashSet.add(twentySecondStudent);
		stHashSet.add(twentyThirdStudent);
		stHashSet.add(twentyFourthStudent);
		stHashSet.add(twentyFifthStudent);
		
		return stHashSet;
	}

}
