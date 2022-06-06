package ru.magnitom;

public class MathClone {
    static int counter = 0;

    static int add(int a, int b) {
        counter++;
        return a + b;
    }

    static int sub(int a, int b) {
        counter++;
        return a - b;
    }

    static double div(int a, int b) {
        counter++;
        return a / b;
    }

    static int multi(int a, int b) {
        counter++;
        return a * b;
    }
}
