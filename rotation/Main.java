package com.company.rotation;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int SIZE = 8;

    public static void filling(int[][] colors) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
    }

    public static void showArray(int[][] colors) {
        for (int[] color : colors) {
            for (int i : color) {
                System.out.format("%4d", i);
            }
            System.out.println();
        }
    }

    public static void turn90degrees(int[][] colors, int[][] rotated) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[i][j] = colors[SIZE - (j + 1)][i];
            }
        }
    }

    public static void turn180degrees(int[][] colors, int[][] rotated) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[i][j] = colors[SIZE - (i + 1)][SIZE - (j + 1)];
            }
        }
    }

    public static void turn270degrees(int[][] colors, int[][] rotated) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[i][j] = colors[j][SIZE - (i + 1)];
            }
        }
    }


    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        filling(colors);
        showArray(colors);
        while (true) {
            System.out.println("Введите на сколько градусов повернуть матрицу:\n" +
                    "1. 90 градусов\n" +
                    "2. 180 градусов\n" +
                    "3. 270 градусов");
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    turn90degrees(colors, rotatedColors);
                    break;
                case 2:
                    turn180degrees(colors, rotatedColors);
                    break;
                case 3:
                    turn270degrees(colors, rotatedColors);
                    break;
            }
            showArray(rotatedColors);
        }
    }
}
