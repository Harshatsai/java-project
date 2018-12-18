package array;

public class Student implements Comparable<Student>{

	String studentName;
	int age;
	int rollNo;
	public Student(String studentName, int age, int rollNo) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", age=" + age
				+ ", rollNo=" + rollNo + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (age==o.age)
		{
			return 0;
		}
		else if(age>o.age)
		{
			return 1;
		}
		else
			
		return -1;
	}
	
	

}
