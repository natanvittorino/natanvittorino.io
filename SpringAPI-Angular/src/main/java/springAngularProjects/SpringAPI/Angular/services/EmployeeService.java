package springAngularProjects.SpringAPI.Angular.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springAngularProjects.SpringAPI.Angular.models.Employee;
import springAngularProjects.SpringAPI.Angular.repositories.EmployeeRepo;
import springAngularProjects.SpringAPI.Angular.repositories.EmployeeRepository;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeRepo employeeRepo;


    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, EmployeeRepo employeeRepo) {
        this.employeeRepository = employeeRepository;
        this.employeeRepo = employeeRepo;
    }


    // Add Employees
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeNumber(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }


    // Find All Employees
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }


    // Update Employee
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    // Find Employee by ID
    public Object findEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }


    // Delete Employee by ID
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }


    // Delete All Employees
    public void deleteAllEmployees() {
        employeeRepo.deleteAll();
    }
}
