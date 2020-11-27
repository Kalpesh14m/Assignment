package com.stmt1;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

//Can one use an Employee class as a key in a HashMap

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<Employee, String> employeeMap = new HashMap<Employee, String>();

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Sachin");
		employee1.setDateOfBirth(new Date(1987, 2, 1));
		employee1.setSalary(new BigDecimal(100000));
		employeeMap.put(employee1, "India");
		System.out.println("===>" + employeeMap);

		Employee employee2 = new Employee();
		employee2.setId(1);
		employee2.setName("Sachin");
		employee2.setDateOfBirth(new Date(1987, 2, 1));
		employee2.setSalary(new BigDecimal(100000));
		employeeMap.put(employee2, "Japan");

		System.out.println("--->>" + employeeMap);
	}
}

class Employee {
	private long id;
	private String name;
	private Date dateOfBirth;
	private BigDecimal salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}