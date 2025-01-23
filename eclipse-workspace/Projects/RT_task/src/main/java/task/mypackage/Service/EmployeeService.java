package task.mypackage.Service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import task.mypackage.Repository.EmployeeRepo;
import task.mypackage.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	public Employee  addEmployee(Employee e) {
		 return repo.save(e);
		
	}
	
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}
	
	public Employee updateEmployee(Employee e) {
		return repo.save(e);
		
	}
	
	public List<Employee> allEmployee(){
		return repo.findAll();
	}
	
	public String deleteEmp(int id) {
		Employee e=getEmployee(id);
		repo.delete(e);
		return "dlt";
		
	}
}
