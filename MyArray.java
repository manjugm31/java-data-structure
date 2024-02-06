package com.kn.array;

import java.util.Scanner;

public class MyArray {

    public int arr[];
    Scanner scan = new Scanner(System.in);

    public MyArray(int length) {
        arr = new int[length];
    }

    public void insert() {
        System.out.println("Enter the position:");
        int position = scan.nextInt();
        System.out.println("Enter the element:");
        int element = scan.nextInt();
        arr[position] = element;
    }

    public void delete() {
        System.out.println("Enter position to delete:");
        int position = scan.nextInt();
        arr[position] = 0;
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
