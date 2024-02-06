package com.kn.circularqueue;

import java.util.Scanner;

public class CircularQueuelogic {
    private int cq[];
    private int size;
    private int r = -1;
    private int f = 0;
    private int count = 0;
    Scanner scan = new Scanner(System.in);

    public CircularQueuelogic(int size) {
        this.size = size;
        cq = new int[size];
    }

    public void insert() {
        if (count == size) {
            System.out.println("Insertion is not possible. Circular Queue is full.");
        } else {
            System.out.println("Enter elements:");
            int elements = scan.nextInt();
            r = (r + 1) % size;
            cq[r] = elements;
            count++;
        }
    }

    public void delete() {
        if (count == 0) {
            System.out.println("Deletion is not possible. Circular Queue is empty.");
        } else {
            System.out.println("Deleted data is " + cq[f]);
            f = (f + 1) % size;
            count--;
        }
    }

    public void display() {
        if (count == 0) {
            System.out.println("Display is not possible. Circular Queue is empty.");
        } else {
            System.out.println("Circular Queue elements:");
            for (int i = 0; i < count; i++) {
                System.out.print(cq[(f + i) % size] + " ");
            }
            System.out.println();
        }
    }
}
