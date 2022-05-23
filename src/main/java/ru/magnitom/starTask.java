package ru.magnitom;

import java.util.Scanner;

public class starTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberInput = sc.nextInt();
        String star = "*";
        for (int i = 0; i < numberInput-1; i++) {
            star = star + "*";
        }
        for (int i = 0; i < numberInput; i++) {
            System.out.println();
            System.out.print(star);
            star = star.substring(0, star.length()-1);
        }
    }
}