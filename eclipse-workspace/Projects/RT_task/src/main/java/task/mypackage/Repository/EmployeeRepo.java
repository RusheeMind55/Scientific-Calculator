package task.mypackage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import task.mypackage.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
