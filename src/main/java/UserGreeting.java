package main.java;

import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name + "!");
    }
}

