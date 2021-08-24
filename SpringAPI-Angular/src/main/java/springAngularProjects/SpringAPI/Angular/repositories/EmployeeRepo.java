package springAngularProjects.SpringAPI.Angular.repositories;

import org.springframework.data.repository.CrudRepository;
import springAngularProjects.SpringAPI.Angular.models.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
