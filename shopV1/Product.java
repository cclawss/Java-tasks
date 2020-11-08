package com.company.shopV1;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private String name;
    private int price;
    private String description;

    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }

    public String toString() {
        String text = "";
        text += "Имя: " + this.getName();
        text += ", Цена: " + this.getPrice();
        text += ", Описание: " + this.getDescription();
        return text;
    }


    public static void show(Product[] product) {
        for (int i = 0; i < Main.counter; i++) {
            System.out.printf("%s\t\t\t %s \t\t\t%s\n", product[i].getName(), product[i].getPrice(), product[i].getDescription());
        }
    }

    public static void bubbleSort(Product[] products) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < Main.counter - 1; i++) {
                if (products[i].price > products[i + 1].price) {
                    isSorted = false;

                    buf = products[i].price;
                    products[i].price = products[i + 1].price;
                    products[i + 1].price = buf;
                }
            }
        }
    }

    public static void quickSort(Product[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle].price;

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].price < opora) {
                i++;
            }

            while (array[j].price > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i].price;
                array[i].price = array[j].price;
                array[j].price = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void selectionSort(Product[] array) {
        for (int i = 0; i < Main.counter; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i].price;
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < Main.counter; j++) {
                if (array[j].price < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j].price;
                }
            }
            array[pos].price = array[i].price;
            array[i].price = min;    // меняем местами наименьший с array[i]
        }
    }

    public static void insertionSort(Product[] array) {
        for (int left = 0; left < Main.counter; left++) {
            // Вытаскиваем значение элемента
            int value = array[left].price;
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i].price) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1].price = value;
        }
    }


    public static void merge(
            Product[] a, Product[] l, Product[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].price <= r[j].price) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void mergeSort(Product[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Product[] l = new Product[mid];
        Product[] r = new Product[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
}
