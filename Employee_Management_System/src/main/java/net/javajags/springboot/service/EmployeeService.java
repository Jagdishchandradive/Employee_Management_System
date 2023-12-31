package net.javajags.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javajags.springboot.model.Employee;

public interface EmployeeService {
	 List<Employee> getAllEmployees();
	 void saveEmployee(Employee employee); 
	 Employee getEmployeeById(long id);// to retrieve an employee for update
	 void deleteEmployeeById(long id);
	 Page < Employee > findPaginated(int pageNo, int pageSize);//for pagination feature
}
