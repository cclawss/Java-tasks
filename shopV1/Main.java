package com.company.shopV1;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.shopV1.Product.*;

public class Main {
    public static Product[] product = new Product[10];

    public static void startAdd() {
        Product product0 = new Product("Творог", 130, "Сырники");
        Product product1 = new Product("Фасоль", 50, "Для салата");
        Product product2 = new Product("Арбуз", 23, "Один");
        Product product3 = new Product("Хлеб", 30, "Два");
        Product product4 = new Product("Торт", 200, "Для др");
        Product product5 = new Product("Молоко", 45, "Литр");
        product[0] = product0;
        product[1] = product1;
        product[2] = product2;
        product[3] = product3;
        product[4] = product4;
        product[5] = product5;
    }

    public static int counter = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startAdd();
        while (true) {
            System.out.println("Введите через пробел название, цену и описание");
            System.out.println("end для выхода из программы");

            String Name = scanner.next();
            if ("end".equals(Name) || counter == 10) {
                System.out.println("Программа завершена.");
                break;
            }
            int price = Integer.parseInt(scanner.next());
            String description = scanner.next();

            Product productAdd = new Product(Name, price, description);
            product[counter] = productAdd;
            counter++;


            scanner.nextLine();
            System.out.println("");


            System.out.println("Продукт -------- Цена  -------- Описание");
            show(product);
            System.out.println("Выберете сортировку: \n" +
                    "1. Selection sort (сортировка выбором) O(n2)\n" +
                    "2. Bubble sort (сортировка пузырьком) O(n^2)\n" +
                    "3. Insertion sort (сортировка вставками) O(n^2)\n" +
                    "4. Quick sort (быстрая сортировка) O(n×log2n)\n" +
                    "5. Merge sort\n" +
                    "6. Arrays sort\n" +
                    "7. Arrays sort Comparator\n");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    selectionSort(product);
                    Product.show(product);
                    break;
                case 2:
                    bubbleSort(product);
                    Product.show(product);
                    break;
                case 3:
                    insertionSort(product);
                    Product.show(product);
                    break;
                case 4:
                    quickSort(product, 0, counter - 1);
                    Product.show(product);
                    break;
                case 5:
                    mergeSort(product, counter);
                    Product.show(product);
                    break;
                case 6:
                    Arrays.sort(product, 0, counter);
                    Product.show(product);
                    break;
                case 7:
                    Arrays.sort(product, 0, counter, new Sort());
                    Product.show(product);
                    break;
            }
        }

    }
}
