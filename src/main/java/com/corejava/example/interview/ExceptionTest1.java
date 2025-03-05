package com.corejava.example.interview;

import java.io.IOException;

public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			throw new IOException();
		}
//		catch(IOException | Exception e) { //The exception IOException is already caught by the alternative Exception
		catch(Exception e) {
			System.out.println("Handled "+e);
		}

	}

}
