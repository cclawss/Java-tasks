package com.company.ListOfEmployees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int searchBySurname(String surname, String name, List<Employee> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(name) && employeeList.get(i).getSurname().equals(surname)) {
                return i;
            } else return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел");
            String surname = scanner.next();
            String name = scanner.next();
            int age = scanner.nextInt();
            String gender = scanner.next();
            String education = scanner.next();
            String position = scanner.next();
            String department = scanner.next();
            Employee emp = new Employee(surname, name, age, gender, education, position, department);
            list.add(emp);

            System.out.println("Если хотите закончить ввод данных, введите end");
            String input = scanner.next();
            if ("end".equals(input)) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).toString());
                }
                while (true) {
                    System.out.println("Если не хотите менять данные, введите end");
                    scanner.nextLine();
                    input = scanner.next();
                    if ("end".equals(input)) {
                        break;
                    } else {
                        System.out.println("Введите фамилию и имя работника, для которого хотите изменить данные");
                        surname = scanner.next();
                        name = scanner.next();

                        int empIndex = searchBySurname(surname, name, list);
                        if (empIndex != -1) {
                            System.out.println(list.get(empIndex).toString());
                            System.out.println("Меняем фамилию?");
                            scanner.nextLine();
                            input = scanner.next();
                            if (input.toLowerCase().equals("да")) {
                                surname = scanner.next();
                                list.get(empIndex).setSurname(surname);
                            }
                            System.out.println("Меняем имя?");
                            input = scanner.next();
                            if (input.toLowerCase().equals("да")) {
                                name = scanner.next();
                                list.get(empIndex).setName(name);
                            }
                            System.out.println("Меняем возраст?");
                            input = scanner.next();
                            if (input.toLowerCase().equals("да")) {
                                age = scanner.nextInt();
                                list.get(empIndex).setAge(age);
                            }
                            System.out.println("Меняем пол?");
                            scanner.nextLine();
                            input = scanner.next();
                            if (input.toLowerCase().equals("да")) {
                                gender = scanner.next();
                                list.get(empIndex).setGender(gender);
                            }
                            System.out.println("Меняем образование?");
                            input = scanner.next();
                            if (input.toLowerCase().equals("да")) {
                                education = scanner.next();
                                list.get(empIndex).setEducation(education);
                            }
                            System.out.println("Меняем должность?");
                            input = scanner.next();
                            if (input.toLowerCase().equals("да")) {
                                position = scanner.next();
                                list.get(empIndex).setPosition(position);
                            }
                            System.out.println("Меняем отдел?");
                            input = scanner.next();
                            if (input.toLowerCase().equals("да")) {
                                department = scanner.next();
                                list.get(empIndex).setDepartment(department);
                            }
                        } else {
                            System.out.println("Сотрудник не найден");
                        }
                        for (Employee task : list) {
                            System.out.println(task.toString());
                        }
                    }
                }
            }
            break;
        }
    }
}
