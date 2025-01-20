package com.corejava.example.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGroupingBy {

	public static void main(String[] args) {
		Map<Long, Customer> customersMap = new HashMap<>();
		customersMap.put(1L, new Customer(1L, "name1", "dept1", 10000, "A"));
		customersMap.put(2L, new Customer(1L, "name2", "dept2", 20000, "B"));
		customersMap.put(3L, new Customer(1L, "name3", "dept1", 10000, "C"));
		customersMap.put(4L, new Customer(1L, "name4", "dept3", 30000, "B"));
		customersMap.put(5L, new Customer(1L, "name5", "dept1", 20000, "A"));
		customersMap.put(6L, new Customer(1L, "name6", "dept3", 40000, "B"));
		customersMap.put(7L, new Customer(1L, "name7", "dept1", 50000, "A"));
		customersMap.put(8L, new Customer(1L, "name8", "dept2", 30000, "C"));
		
		Map<String, List<Customer>> customersGroupedByDept = customersMap.entrySet().stream()
				.collect(Collectors.groupingBy(cust->cust.getValue().getDept(), 
						Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
		System.out.println(customersGroupedByDept);
	}
}

class Customer{
	Long id;String name;String dept;double salary;String grade;

	public Customer(Long id, String name, String dept, double salary, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.grade = grade;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
	
}