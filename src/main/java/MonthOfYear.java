package main.java;

import java.util.Scanner;

public class MonthOfYear {
    public static void main(String[] args) {
        String[] month = {"January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October",
                "November", "December"
        };
        System.out.println("Please enter a number of month:");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        if (number == 0 || number > 12)
            System.out.println("Incorrect number of month!");
        else
            System.out.println(month[number - 1]);
    }
}
