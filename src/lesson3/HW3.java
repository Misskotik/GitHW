package lesson3;

import java.util.Arrays;
import java.util.Scanner;


public class HW3 {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] arg) {
        System.out.println("Task 1");
        invertArray();

        System.out.println(" ");
        System.out.println("------- ");
        System.out.println("Task 2");
        fillArray();

        System.out.println(" ");
        System.out.println("------- ");
        System.out.println("Task 3");
        changeArray();
        System.out.println(" ");
        System.out.println("------- ");
        System.out.println("Task 4");
        fillDiagonal();
        System.out.println(" ");
        System.out.println("------- ");
        System.out.println("Task 5");
        arrayLenValue();

    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 1, 0, 0};
        System.out.println("Array is set");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1) {
                arr[i] = arr[i] + 1;
            } else {
                arr[i] = arr[i] - 1;
            }
        }
        System.out.println("Inverted Array");
        System.out.println(Arrays.toString(arr));

    }


    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + 1);
        }

    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Array is set");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("Array is changed");
        System.out.println(Arrays.toString(arr));

    }


    public static void fillDiagonal() {
        int count = 1;
        int n = 4;
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (n-1)-i == j) {
                    table[i][j] = count;
                    System.out.print(table[i][j] + " ");

                } else {
                    table[i][j] = 0;
                    System.out.print(table[i][j] + " ");

                }
            } System.out.println();
        }

    }

        public static void arrayLenValue () {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Type the length of array: ");
        int len = sc.nextInt();
        System.out.println("Type the number for array: ");
        int initialValue = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;

        }
            System.out.println(Arrays.toString(arr));

        }




}


















