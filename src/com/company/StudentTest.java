package com.company;

public class StudentTest {


    public static void equaksName(Student st1, Student st2) {
        if (st1.id == st2.id || st1.name.equals(st2.name)) {
            System.out.println("student's ==");
        } else {
            System.out.println("student's !=");
        }
    }

    public static void ravnStudent(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.id == st2.id) {
                System.out.println("student's ==");
            } else {
                System.out.println("student's == name");
            }
        } else {
            System.out.println("student's !=");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student(1, "Rut");
        Student st2 = new Student(1, "Rut");
        equaksName(st1, st2);
        ravnStudent(st1, st2);
    }
}
