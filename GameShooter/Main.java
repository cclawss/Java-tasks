package com.company.GameShooter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount());
        int slot;
        while (true) {
            try {
                slot = scanner.nextInt();
                if (slot == -1) {
                    System.out.println("Game over!");
                }
                player.shotWithWeapon(slot);

            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }
    }
}