package task.mypackage.model;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblemp")
public class Employee {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int employeeid;
	
	private String employeename;
	private String position;
	private String  department;
	private float salary;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeid, String employeename, String position, String department, float salary) {
		super();
		employeeid = employeeid;
		employeename = employeename;
		this.position = position;
		this.department = department;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeid;
	}

	public void setEmployeeId(int employeeId) {
		employeeid = employeeId;
	}

	public String getEmployeeName() {
		return employeename;
	}

	public void setEmployeeName(String employeeName) {
		employeename = employeeName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
