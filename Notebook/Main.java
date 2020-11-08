package com.company.Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void ListOutput(List tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + " - " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List tasks = new ArrayList();
        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    while (true) {
                        System.out.print("Введите название задачи (для завершения введите end)\n");
                        String task = scanner.next();
                        if (task.equals("end")) {
                            break;
                        }
                        tasks.add(task);
                    }
                    break;
                case 2:
                    ListOutput(tasks);
                    break;
                case 3:
                    while (true) {
                        if (tasks.size() != 0) {
                            System.out.println("Введите индекс задачи которую хотите удалить");
                            ListOutput(tasks);
                            String input = scanner.next();
                            if (input.equals("finish")) {
                                break;
                            }
                            tasks.remove(Integer.parseInt(input));
                        } else {
                            System.out.println("Задач больше нет в списке.");
                            break;
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
