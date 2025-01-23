package task.mypackage.Controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import task.mypackage.Service.EmployeeService;
import task.mypackage.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	//From
	
	@GetMapping("/")
	public String NewEmployee(Model model) {
		
		Employee cs=new Employee();
		
		model.addAttribute("Employee",cs);
		
		
		return "employeeform";
	}
	
	@PostMapping("/")
	public String newEmployee(Model model , @ModelAttribute("Employee")Employee cus) {
			
		service.addEmployee(cus);
		
		Employee ct=new Employee();
		
		model.addAttribute("Employee",ct);
		
		return "employeeform";
	}
	
//	List

	//List
	
	
	@GetMapping("/employeelist")
	public String employee(Model model, @ModelAttribute("employee")Employee e) {
		
		List<Employee> lst=service.allEmployee();
		model.addAttribute("employeelist",lst);
		
		model.addAttribute("employee",e);
		
		return "EmployeeList";
		
		
	}
	
	@PostMapping("/employeelist")
	public String EmployeeList(Model model,@ModelAttribute("employee")Employee e) {
		
		
		List<Employee> lst=service.allEmployee();
		model.addAttribute("employeelist",lst);
	
	//	model.addAttribute("employee",e);
			return "EmployeeList";
		
	}
		//update

	
    @GetMapping("/updateEmployee/{id}")
    public String showEmployeer(@PathVariable("id") int id, Model model) {
    
    	Employee e = service.getEmployee(id);
        model.addAttribute("employee", e); 

        return "updateEmployee"; 
    }

   
    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute("employee") Employee e) {
    	
    	service.addEmployee(e);
        
    	return "redirect:/employeelist"; 

    }

    //deleted

    @GetMapping("/deleteEmployee/{id}")
    public String  deleteEmployeeId(@PathVariable("id") int EmployeeId) {
	
	service.deleteEmp(EmployeeId);
	
	return "redirect:/employeelist";
}
	
	
}
