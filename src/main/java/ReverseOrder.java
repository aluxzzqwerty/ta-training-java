package main.java;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }
}
