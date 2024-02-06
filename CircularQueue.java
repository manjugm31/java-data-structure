package com.kn.circularqueue;

import java.util.Scanner;

import com.kn.queue.Queue;

public class CircularQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter  size:");
        int size = scan.nextInt();
        CircularQueuelogic cqueue = new CircularQueuelogic(size);

        while (true) {
            System.out.println("1 for insert");
            System.out.println("2 for delete");
            System.out.println("3 for display");
            System.out.println("0 to exit");
            System.out.println("Enter your choice:");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    cqueue.insert();
                    break;
                case 2:
                    cqueue.delete();
                    break;
                case 3:
                    cqueue.display();
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


