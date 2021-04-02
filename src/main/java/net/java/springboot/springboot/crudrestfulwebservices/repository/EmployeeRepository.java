package net.java.springboot.springboot.crudrestfulwebservices.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data. jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.java.springboot.springboot.crudrestfulwebservices.model.*;

/*
 * Employee Repository uses JPA Repository Pattern to perform CRUD Operations
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	/*
	 * This method provides list of active employees 
	 * 
	 */
	@Query("SELECT emp FROM Employee  emp WHERE emp.isActive = true")
    List<Employee> findAllActive();
	
	/*
	 * This method provides Active Employee 
	 * @param id is employee id
	 */
	@Query("SELECT emp FROM Employee  emp WHERE emp.isActive = true AND emp.id=(:id)" )
	Employee findAllActiveById(@Param("id")long id);

}
