package com.stmt3;

import java.util.ArrayList;
import java.util.List;

final class Student {
	private final int id;
	private final String name;
	private final String city;

	private Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public static Student valueOf(int id, String name, String city) {
		return new Student(id, name, city);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}

public class ImmutableClass {
	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();

		studentList.add(Student.valueOf(2, "Jayesh", "Mumbai"));
		studentList.add(Student.valueOf(4, "Bhushan", "Nasik"));
		studentList.add(Student.valueOf(3, "Akshy", "Dhule"));
		studentList.add(Student.valueOf(1, "Kalpesh", "Pune"));
		studentList.add(Student.valueOf(5, "Prerana", "Nasik"));

		studentList.forEach(student -> System.out.println(student));
	}
}
