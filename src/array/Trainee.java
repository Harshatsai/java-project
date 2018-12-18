package array;

public class Trainee {

	private int empId;
	 private String empName;
	 private double salary;
	public Trainee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Trainee [empId=" + empId + ", empName=" + empName + ", salary="
				+ salary + "]";
	}
	
	
	
}
