package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//        System.out.println();
//        System.out.println();
//
//        int min = 5;
//        int max = 10;
//        int newRandom = random.nextInt((max-min) + 1) + min;
//        System.out.println(newRandom);

        System.out.println("Type how many numbers to generate:");
        int numberCount = scanner.nextInt();

        System.out.println("Type the lower bound:");
        int min = scanner.nextInt();

        System.out.println("Type the upper bound:");
        int max = scanner.nextInt();

        for (int i = 0; i < numberCount; i++) {
            System.out.println(random.nextInt((max-min))+min);
        }

    }
}
