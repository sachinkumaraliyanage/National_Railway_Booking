package gov.employee.check.repository;


import org.springframework.data.mongodb.repository.MongoRepository;



import gov.employee.check.domain.Employee;



public interface Employeerepository extends MongoRepository<Employee,String> {
	
	public Employee findByNic(String nic);

}
