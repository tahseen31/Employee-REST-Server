package net.java.springboot.springboot.crudrestfulwebservices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import net.java.springboot.springboot.crudrestfulwebservices.model.Employee;
import net.java.springboot.springboot.crudrestfulwebservices.repository.EmployeeRepository;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootCrudRestfulWebservicesApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudRestfulWebservicesApplication.class, args);
		
	}

	/*
	 * Repository is pre-populated with Employees at start up of Application
	 */
	@Bean
	CommandLineRunner runner(EmployeeRepository repository) {
		return args -> {
			
			repository.save(new Employee("Jane", "Elizabeth", "Doe", "06-06-1996", "09-01-1996", true));
			repository.save(new Employee("Inactive", "lisa", "kudrow", "06-06-1996", "09-01-1996", false));
			repository.save(new Employee("joey", "", "Tribiani", "06-06-1996", "09-01-1996", true));
			
			
			
			
		}; 
	} 
	
	
}
