package com.corejava.example.completablefuture.supplyasync;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDatabase {
	
	public static List<Employee> getEmployees(File file){
		ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper
                    .readValue(file, new TypeReference<List<Employee>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
	}
}
