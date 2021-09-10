package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");

        while (!new Password(scanner.nextLine()).validatePassword()) {
            new Password(scanner.nextLine()).validatePassword();
        }


    }
}
