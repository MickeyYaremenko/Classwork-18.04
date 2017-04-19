package by.htp.firsttask;

public class Student{
	private String firstName;
	private String secondName;
	private String midName;
	
	public Student(String firstName, String secondName, String midName){
		this.firstName = firstName;
		this.secondName = secondName;
		this.midName = midName;
	}
	
	

	public String getFirstName() {
		return firstName;
	}



	public String getSecondName() {
		return secondName;
	}



	public String getMidName() {
		return midName;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((midName == null) ? 0 : midName.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (midName == null) {
			if (other.midName != null)
				return false;
		} else if (!midName.equals(other.midName))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", secondName=" + secondName + ", midName=" + midName + "]" + "\n";
	}

}
