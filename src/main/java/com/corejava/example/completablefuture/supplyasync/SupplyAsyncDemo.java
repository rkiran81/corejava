package com.corejava.example.completablefuture.supplyasync;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class SupplyAsyncDemo {

	public static void main(String[] args) {
		SupplyAsyncDemo.readFile(new File("C:\\Backup Files\\Anthem\\PracticeProjects\\workspace\\corejava\\src\\main\\java\\com\\corejava\\example\\completablefuture\\supplyasync\\employees.json"));
		List<Employee> employees = EmployeeDatabase.getEmployees(new File("C:\\Backup Files\\Anthem\\PracticeProjects\\workspace\\corejava\\src\\main\\java\\com\\corejava\\example\\completablefuture\\supplyasync\\employees.json"));
		System.out.println(employees.size());
	}
	
	public static void readFile(File file) {
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			reader.lines().forEach(line -> {
				System.out.println(line);
			});
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
