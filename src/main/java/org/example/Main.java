package org.example;

import org.example.Service.ClassifyUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to IlearnSystem");
        System.out.println("-------------------------");

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 1) {
                ClassifyUser.verifyUser(sc);
            } else if (choice == 2) {
                System.out.println("Exiting system. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
