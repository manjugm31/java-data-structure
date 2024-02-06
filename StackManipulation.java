package com.kn.stack;

import java.util.Scanner;

public class StackManipulation {

	
		public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter stack size:");
	        int size = scan.nextInt();
	        Stack stack = new Stack(size);

	        while (true) {
	            System.out.println("1 for push");
	            System.out.println("2 for pop");
	            System.out.println("3 for display");
	            System.out.println("0 to exit");
	            System.out.println("Enter your choice:");

	            int choice = scan.nextInt();
	            switch (choice) {
	                case 1:
	                    stack.push();
	                    break;
	                case 2:
	                    stack.pop();
	                    break;
	                case 3:
	                    stack.display();
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
