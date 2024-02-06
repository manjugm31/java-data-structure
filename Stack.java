package com.kn.stack;

import java.util.Scanner;

public class Stack {
    private int arr[];
    private int size;
    private int top = -1;
    private Scanner scan = new Scanner(System.in);

    // Constructor
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }


    public void push() {
        if (top == size - 1) {
            System.out.println("Stack is full. Push not possible.");
        } else {
            System.out.println("Enter the element:");
            int element = scan.nextInt();
            top++;
            arr[top] = element;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Pop not possible.");
        } else {
            System.out.println("Deleted element is " + arr[top]);
            top--;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty. Display not possible.");
        } else {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
