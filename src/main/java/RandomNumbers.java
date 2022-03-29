package main.java;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter a quantity of random nums you wanna get:");
        Scanner scan = new Scanner(System.in);
        int userArg = scan.nextInt();

        Random randomNum = new Random();
        for (int i = 0; i < userArg; i++) {
            System.out.println(getRandomNum(randomNum));
        }

        for (int i = 0; i < userArg; i++) {
            System.out.print(getRandomNum(randomNum));
        }

    }
    public static int getRandomNum(Random randomNum) {
        return randomNum.nextInt();
    }
}
