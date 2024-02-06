package com.kn.queue;

import java.util.Scanner;

import com.kn.stack.Stack;

public class QuiueManipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter queue size:");
        int size = scan.nextInt();
        Queue queue = new Queue(size);

        while (true) {
            System.out.println("1 for insert");
            System.out.println("2 for delete");
            System.out.println("3 for display");
            System.out.println("0 to exit");
            System.out.println("Enter your choice:");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    queue.insert();
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    queue.display();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }

	}


