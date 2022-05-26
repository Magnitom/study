package ru.magnitom;

import java.util.Scanner;

public class VaragsItPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввыелите строку");
        String stringInput = sc.nextLine();
        System.out.println("Введите количество передаваемых символов");
        int lenghtArr = sc.nextInt();
        String[] arrString = new String[lenghtArr];
        sc.nextLine();
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = sc.nextLine();
        }
        System.out.println(CompSt(stringInput, arrString));
    }

    public static boolean CompSt(String stringIn, String... arr) {
        String resultArr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            resultArr = resultArr + arr[i];
        }
        return stringIn.equals(resultArr);
    }
}
