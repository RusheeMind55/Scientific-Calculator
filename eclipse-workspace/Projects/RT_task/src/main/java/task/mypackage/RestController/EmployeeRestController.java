package task.mypackage.RestController;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import task.mypackage.Service.EmployeeService;
import task.mypackage.model.Employee;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/add")
	public Employee addEmp(Employee e) {
		return 	service.addEmployee(e);
	}
	
	@GetMapping("/getbyId/{id}")
	public Employee GetParticulerEmployee(@RequestParam("id") int id) {
		return 	service.getEmployee(id);
	}
	
	@PutMapping("/update")
	public Employee updateEmp(Employee e) {
		return service.updateEmployee(e);
	}
	
	@GetMapping("/all")
	public List<Employee> All() {
		return service.allEmployee();
	}
	
	@DeleteMapping("/dlt/{id}")
	public String dlt(@RequestParam("id") int id) {
		String msg=service.deleteEmp(id);
		return msg;
	}
	
}
