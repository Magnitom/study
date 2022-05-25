package ru.magnitom;

import java.util.Scanner;

public class SredneeTask {


    public static int sredNum(int a, int b, int c) {
        int result;
        if (((b >= a) && (b <= c)) || ((b <= a) && (b >= c))) {
            result = b;
        }
        if (((a >= b) && (a <= c)) || ((a <= b) && (a >= c))) {
            result = a;
        } else result = c;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(sredNum(a, b, c));
    }
}
