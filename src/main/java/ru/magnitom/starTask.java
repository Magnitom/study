package ru.magnitom;

import java.util.Scanner;

public class starTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberInput = sc.nextInt();
        StringBuilder star = new StringBuilder("*");
        for (int i = 0; i < numberInput - 1; i++) {
            star.append("*");
        }
        for (int i = 0; i < numberInput; i++) {
            if (i != 0) {
                System.out.println();
            }
            System.out.print(star);
            star = new StringBuilder(star.substring(0, star.length() - 1));
        }
    }
}