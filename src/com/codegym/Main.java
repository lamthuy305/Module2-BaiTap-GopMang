package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length1, length2;

        do {
            System.out.print("Nhập số phần tử mảng 1: ");
            length1 = scanner.nextInt();

            if (length1 > 5)
                System.out.println("Số phần tử không quá 10");
        } while (length1 > 5);

        int arr1[] = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.print("Nhập phần tử vị trí thứ " + i + " mảng 1: ");
            arr1[i] = scanner.nextInt();
        }

        do {
            System.out.print("Nhập số phần tử mảng 2: ");
            length2 = scanner.nextInt();

            if (length2 > 5)
                System.out.println("Số phần tử không quá 10");
        } while (length2 > 5);

        int arr2[] = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.print("Nhập phần tử thứ " + i + " mảng 2: ");
            arr2[i] = scanner.nextInt();
        }


        int[] newArr = gopMang(arr1, arr2);
        System.out.println("Mảng sau khi gộp là: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }


    public static int[] gopMang(int[] array1, int[] array2) {
        int newArray[] = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int j = array1.length; j < array1.length + array2.length; j++) {
            newArray[j] = array2[j - array1.length];
        }

        return newArray;
    }
}
