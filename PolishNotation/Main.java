package com.company.PolishNotation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> sign = new Stack<>();
        Queue<Integer> numbers = new ArrayDeque<>();
        String[] arrayValues;
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();
        arrayValues = input.split(" ");
        for (int i = 0; i < arrayValues.length; i++) {
            String value = arrayValues[i];
            if (value.matches("\\d") == true) {
                numbers.add(Integer.parseInt(value));
            } else {
                sign.add(value);
            }
        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }
        while (!sign.isEmpty()) {
            System.out.print(sign.pop() + " ");
        }
    }
}
