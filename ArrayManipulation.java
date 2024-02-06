package com.kn.array;

import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length:");
        int length = scan.nextInt();
        MyArray myArray = new MyArray(length);

        while (true) {
            System.out.println("1 for insert");
            System.out.println("2 for delete");
            System.out.println("3 for display");
            System.out.println("0 to exit");
            System.out.println("Enter your choice:");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    myArray.insert();
                    break;
                case 2:
                    myArray.delete();
                    break;
                case 3:
                    myArray.display();
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
