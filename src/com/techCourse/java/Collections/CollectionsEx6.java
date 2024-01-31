package com.techCourse.java.Collections;

import java.util.Comparator;
import java.util.TreeSet;

class StudentsCompareName implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
}

class StudentsCompareSNO implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.getSno().compareToIgnoreCase(o2.getSno());
	}
}

class StudentsCompareScore implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.getScore() >= o2.getScore() ? 1 : -1;
	}
}
class Student {
	private String name;
	private String sno;
	private Integer score;
	
	public Student(String name, String sno, Integer score) {
		this.name = name;
		this.sno = sno;
		this.score = score;
	}

	public String getName() {
		return name;
	}
	public String getSno() {
		return sno;
	}
	public Integer getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sno=" + sno + ", score=" + score + "]";
	}
	
	

	
}

public class CollectionsEx6 {
	
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<Student>(new StudentsCompareName());
		
		students.add(new Student("d", "abc", 90));
		students.add(new Student("f", "cde", 91));
		students.add(new Student("a", "fg", 95));
		
		System.out.println(students);
		System.out.println();
		
		TreeSet<Student> studentsSNO = new TreeSet<Student>(new StudentsCompareSNO());
		studentsSNO.add(new Student("d", "abc", 90));
		studentsSNO.add(new Student("f", "cde", 91));
		studentsSNO.add(new Student("a", "fg", 95));
		System.out.println(studentsSNO);
		System.out.println();
		
		TreeSet<Student> studentsScore = new TreeSet<Student>(new StudentsCompareScore());
		studentsScore.add(new Student("d", "abc", 99));
		studentsScore.add(new Student("f", "cde", 91));
		studentsScore.add(new Student("a", "fg", 95));
		System.out.println(studentsScore);
	}

}
