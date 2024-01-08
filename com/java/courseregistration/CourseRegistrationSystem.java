package com.java.courseregistration;

import java.util.HashSet;
import java.util.Set;

class Course {
    private String name;
    private int slot;
    private int maxStudents;
    private Set<Student> students;
    private Professor professor;

    public Course(String name, int slot, int maxStudents) {
        this.name = name;
        this.slot = slot;
        this.maxStudents = maxStudents;
        this.students = new HashSet<>();
        this.professor = null;
    }

    public boolean assignStudent(Student student) {
        if (students.size() < maxStudents) {
            students.add(student);
            return true;
        } else {
            return false;
        }
    }

    public boolean assignProfessor(Professor professor) {
        if (this.professor == null) {
            this.professor = professor;
            return true;
        } else {
            return false;
        }
    }

    public int getSlot() {
        return slot;
    }

    public String getName() {
        return name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Professor getProfessor() {
        return professor;
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        // Create courses
        Course c1 = new Course("c1", 1, 10);
        Course c2 = new Course("c2", 2, 2);
        Course c3 = new Course("c3", 1, 5);

        // Create students
        Student s1 = new Student("s1");
        Student s2 = new Student("s2");
        Student s3 = new Student("s3");

        // Create professors
        Professor p1 = new Professor("p1");
        Professor p2 = new Professor("p2");

        // Assign students to courses
        System.out.println(s1.getName() + " - " + c1.getName() + " → " + c1.assignStudent(s1));
        System.out.println(s1.getName() + " - " + c2.getName() + " → " + c2.assignStudent(s1));
        System.out.println(s1.getName() + " - " + c3.getName() + " → " + c3.assignStudent(s1));
        System.out.println(s2.getName() + " - " + c2.getName() + " → " + c2.assignStudent(s2));
        System.out.println(s3.getName() + " - " + c2.getName() + " → " + c2.assignStudent(s3));

        // Assign professors to courses
        System.out.println(p1.getName() + " - " + c1.getName() + " → " + c1.assignProfessor(p1));
        System.out.println(p1.getName() + " - " + c2.getName() + " → " + c2.assignProfessor(p1));
        System.out.println(p1.getName() + " - " + c3.getName() + " → " + c3.assignProfessor(p1));
        System.out.println(p2.getName() + " - " + c1.getName() + " → " + c1.assignProfessor(p2));
    }
}
