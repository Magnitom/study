package ru.magnitom;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(MaxValue(a));
        System.out.println(MaxValue(a, b));
        System.out.println(MaxValue(a, b, c));
        System.out.println(MaxValue(a, b, c, d));
    }

    public static int MaxValue (int a, int b, int c, int d){
        int result = Math.max(a, b);
        result = Math.max(result, c);
        result = Math.max(result, d);
        return result;
    }

    public static int MaxValue (int a, int b, int c){
        int result = Math.max(a, b);
        result = Math.max(result, c);
        return result;
    }

    public static int MaxValue (int a, int b){
        int result = Math.max(a, b);
        return result;
    }

    public static int MaxValue (int a){
        return a;
    }
}
