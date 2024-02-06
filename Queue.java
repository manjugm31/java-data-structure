package com.kn.queue;

import java.util.Scanner;

public class Queue {
    private int q[];
    private int size;
    private int r = -1; // Initialize r to -1 since you are inserting at the beginning
    private int f = 0;
    Scanner scan = new Scanner(System.in);

    public Queue(int size) {
        this.size = size;
        q = new int[size];
    }

    public void insert() {
        int element;
        if (r == size - 1) {
            System.out.println("Insertion is not possible. Queue is full.");
        } else {
            System.out.println("Enter element:");
            element = scan.nextInt();
            r++;
            q[r] = element;
        }
    }

    public void delete() {
        if (f > r&& r==-1) {
            System.out.println("Deletion is not possible. Queue is empty.");
        } else {
            System.out.println("Deleted data is " + q[f]);
            f++;
        }
    }

    public void display() {
        if (f > r &&r==-1) {
            System.out.println("Display is not possible. Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = f; i <= r; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println(); // Add a new line for better formatting
        }
    }
}
