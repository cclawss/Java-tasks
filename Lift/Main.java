package com.company.Lift;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> liftTrack = new ArrayDeque();
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previousFloor = 0;
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int currentFloor = scanner.nextInt();
            if (currentFloor != -1 && currentFloor > 0 && currentFloor <= 25) {
                liftTrack.offer(currentFloor);
                totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
                totalSeconds += waitDoorsInSeconds;
                previousFloor = currentFloor;
            }
            if (currentFloor == 0) {
                while (liftTrack.peek() != null) {
                    System.out.print("Этаж " + liftTrack.poll());
                    if (liftTrack.peek() != null) {
                        System.out.print(" -> ");
                    }
                }
                System.out.println("\nВремя затраченное лифтом на маршрут =: " + totalSeconds + " с.");
                break;
            }
        }
    }
}