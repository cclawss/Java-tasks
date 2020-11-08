package com.company.StudentsList;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Student> studentList = new HashSet<Student>();
        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\", " +
                    "для вывода студентов напишите \"стоп\"");
            String[] input = scanner.nextLine().split(",");
            if (input[0].equals("стоп")) {
                System.out.println("Список студентов:");
                for (Student student1 : studentList) {
                    System.out.println("\t-" + student1.getName() + "," + student1.getGroup() + "," + student1.getStudentId());
                }
                break;
            }
            Student student = new Student(input[0], input[1], input[2]);
            if (studentList.add(student) == false) {
                System.out.println("Ошибка, студент с таким номером студенческого уже существует");
            }
        }
    }
}
