package com.jpa.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.employee.entities.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>
{
	@Query("select e from 123 Employee e where e.lastName=?1")
	List<Employee> findByLastNameEmployeeInfo(String lastName);

	@Query("select e from Employee e where e.firstName=?1 AND e.email=?2")
	List<Employee> findByFirstNameAndEmail(String firstName, String email);
	
	List<Employee> findByLastName(String lastName);
}
