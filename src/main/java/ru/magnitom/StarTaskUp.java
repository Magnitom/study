package ru.magnitom;

import java.util.Scanner;

public class StarTaskUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberStars = sc.nextInt();
        String star = "*";
        for (int i = 0; i < numberStars; i++) {
            if (i != 0){
                System.out.println();
            }
            System.out.print(star);
            star = star + "*";
        }
    }
}
