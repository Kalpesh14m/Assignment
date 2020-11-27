package com.stmt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	int id;
	String name;
	String city;

	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (getId() == o.getId())
			return 0;
		else if (this.getId() > o.getId())
			return 1;
		else
			return -1;
	}

}

class NameCompare implements Comparator<Student> {
	public int compare(Student m1, Student m2) {
		return m1.getCity().compareTo(m2.getCity());
	}
}

public class ListSort {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student(2, "Jayesh", "Mumbai"));
		studentList.add(new Student(4, "Bhushan", "Nasik"));
		studentList.add(new Student(3, "Akshy", "Dhule"));
		studentList.add(new Student(1, "Kalpesh", "Pune"));
		studentList.add(new Student(5, "Prerana", "Nasik"));

		studentList.forEach(student -> System.out.println(student));

		// First name sorter
		// Comparator<Student> compareByName = (Student o1, Student o2) ->
		// o1.getName().compareTo(o2.getName());
		// Collections.sort(studentList, compareByName);

		NameCompare nameCompare = new NameCompare();
		Collections.sort(studentList, nameCompare);

		System.out.println("\n\nAfter Name Compare() Sort: ");
		studentList.forEach(student -> System.out.println(student));

		Collections.sort(studentList);
		System.out.println("\n\nAfter Id compareTo() Sort: ");
		studentList.forEach(student -> System.out.println(student));

	}
}
