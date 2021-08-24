package springAngularProjects.SpringAPI.Angular.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springAngularProjects.SpringAPI.Angular.models.Employee;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
