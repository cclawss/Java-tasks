package com.company.CarBase;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Transport> transports = new HashSet<Transport>();
        while (true) {
            System.out.println("Введите информацию об автомобиле (в формате: номер, марка, цвет, тип автомобиля):");
            String[] input = scanner.nextLine().split(",");
            if (input[0].equals("")) {
                showPassengerCar(transports);
                showTruckCar(transports);
                break;
            }
            if (input[3].equals(" легковой")) {
                if (transports.add(new Passenger(input[0], input[1], input[2], input[3])) == false) {
                    System.out.println("Ошибка, машина с таким номерным знаком уже существует");
                }
            }
            if (input[3].equals(" грузовой")) {
                if (transports.add(new Truck(input[0], input[1], input[2], input[3])) == false) {
                    System.out.println("Ошибка, машина с таким номерным знаком уже существует");
                }
            }
        }
    }

    private static void showTruckCar(HashSet<Transport> transports) {
        System.out.println("Грузовые автомобили:");
        for (Transport transport : transports) {
            if (transport.getType().equals(" грузовой")) {
                System.out.println(transport.getNumber() + "," + transport.getModel() + "," + transport.getColor());
            }
        }
    }

    private static void showPassengerCar(HashSet<Transport> transports) {
        System.out.println("Легковые автомобили:");
        for (Transport transport : transports) {
            if (transport.getType().equals(" легковой")) {
                System.out.println(transport.getNumber() + "," + transport.getModel() + "," + transport.getColor());
            }
        }
    }

}
