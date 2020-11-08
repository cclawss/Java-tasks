package com.company.shopV2;

import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};
    public static int[] prices = new int[]{100, 200, 300};
    public static int counter = 0;
    public static Basket[] personBasket = new Basket[3];
    public static int sumProducts = 0;

    public static void printOut() {
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " - Цена: " + cf.format(prices[i]));
        }
        System.out.println("Выберите товар и количество или введите `end`");
    }

    public static boolean checkStatus(Basket[] basket, int Number, int Count) {
        for (int i = 0; i < counter; i++) {
            if (products[Number].equals(basket[i].getName())) {
                int sum = Count * prices[Number];
                basket[i].add(Count, sum);
                sumProducts += sum;
                return false;
            }
        }
        return true;
    }


    public static void fillingArray(int Number, int Count) {
        int sum = Count * prices[Number];
        Basket basket = new Basket(products[Number], Count, prices[Number], sum);
        personBasket[counter] = basket;
        sumProducts += sum;
        counter++;
    }

    public static void print(Basket[] basket) {
        String header = "\n\tВаша корзина:" +
                "\n\tНаименование товара\tКоличество\tЦена/за.ед\tОбщая стоимость\n" +
                "\t-------------------\t----------\t----------\t---------------\n";
        System.out.print(header);

        for (int i = 0; i < counter; i++) {
            for (int y = 0; y < 3; y++) {
                if (basket[i].getName().equals(products[y])) {
                    System.out.println("\t" + basket[i].getName() + "\t\t\t\t" + basket[i].getCount() + "\t\t\t" + cf.format(basket[i].getCosts()) + "\t\t" + cf.format(basket[i].getPrice()));
                }
            }
        }

        System.out.println("\t-------------------\t----------\t----------\t---------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t Всего: " + cf.format(sumProducts));
    }


    public static void main(String[] args) {
        while (true) {
            printOut();
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("end")) {
                break;
            }
            String[] splitResult = input.split(" ");
            try {
                int productNumber = Integer.parseInt(splitResult[0]) - 1;
                int productCount = Integer.parseInt(splitResult[1]);
                if (checkStatus(personBasket, productNumber, productCount)) {
                    fillingArray(productNumber, productCount);
                }
                print(personBasket);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Требуется целочисленный аргумент.");
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат аргумента.");
            }
        }
    }
}


