package Api.BD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Api.BD.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
