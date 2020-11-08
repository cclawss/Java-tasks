package com.company.seaBattle;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int MAX_COUNT = 10;
    public static int SIZE = 10;
    public static int warField[][] = new int[SIZE][SIZE];
    public static int EMPTY = 0;
    public static int SHIP = 1;
    public static int DEAD = 2;
    public static int MISS = 3;
    public static int score = 0;
    public static int numberOfMoves = 30;

    public static void showAdmin() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("|"+warField[i][j]+"|");
            }
            System.out.println();
        }
    }

    public static void showGameField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("|");
                if (warField[i][j] == EMPTY || warField[i][j] == SHIP) {
                    System.out.print("_");
                } else if (warField[i][j] == DEAD) {
                    System.out.print("X");
                } else if (warField[i][j] == MISS) {
                    System.out.print("o");
                }
            }
            System.out.println("|");
        }
    }

    public static void addShip() {
        Random random = new Random();
        for (int i = 0; i < MAX_COUNT; i++) {
            int shipPlace1 = random.nextInt(SIZE);
            int shipPlace2 = random.nextInt(SIZE);
            if (warField[shipPlace1][shipPlace2] == SHIP) {
                i--;
            }
            warField[shipPlace1][shipPlace2] = SHIP;
        }
    }


    public static void check(int x1, int y1) {
        if (warField[x1][y1] == EMPTY) {
            warField[x1][y1] = MISS;
            System.out.println("Промах, осталось " + numberOfMoves + " ходов");
        } else if (warField[x1][y1] == SHIP) {
            warField[x1][y1] = DEAD;
            System.out.println("Попадание, осталось " + numberOfMoves + " ходов");
        } else if (warField[x1][y1] == MISS || warField[x1][y1] == DEAD) {
            System.out.println("Вы уже выбирали эту клетку");
        }
    }

    public static void main(String[] args) {
        addShip();
        while (true) {
            showAdmin();
            showGameField();
            int X1 = scanner.nextInt();
            int Y1 = scanner.nextInt();
            numberOfMoves--;
            check(X1, Y1);
            if (score == 10 || numberOfMoves == 0) {
                break;
            }
        }

    }
}
