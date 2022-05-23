package ru.magnitom;

import java.util.Scanner;

public class syntaxNumber2Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        if (stringInput.length() < 5) {
            if (stringInput.substring(0, 1).equals("а")) {
                System.out.println("Первая буква - а");
            } else {
                System.out.println(stringInput.substring(1, stringInput.length()));
            }
        } else if (stringInput.length() > 5) {
            if (stringInput.substring(stringInput.length() - 1, stringInput.length()).equals("я")) {
                System.out.println("Последняя буква - я");
            } else {
                System.out.println(stringInput.substring(0, stringInput.length() - 1));
            }
        } else {
            System.out.println(stringInput);
        }
    }
}
