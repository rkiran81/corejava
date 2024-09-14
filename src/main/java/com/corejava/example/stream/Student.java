package com.corejava.example.stream;

public class Student {
	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		Student s;
		if (!(o instanceof Student)) {
			return false;
		}

		else {
			s = (Student) o;
			if (this.name.equals(s.getName()) && this.age == s.getAge()) {
				return true;
			}
		}
		return false;
	}
}
