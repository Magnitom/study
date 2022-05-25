package ru.magnitom;

import java.util.Scanner;

public class Fiba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(FibaNum(num));
    }

    public static int FibaNum(int num) {
        int result =0;
        if (num == 1) {
            result = 0;
        } else if (num == 2) {
            result = 1;
        } else {
            Integer[] arrFib = new Integer[num];
            arrFib[0] = 0;
            arrFib[1] = 1;
            for (int i = 2; i < num; i++) {
                arrFib[i] = arrFib[i-1]+ arrFib[i-2];
            }
            result = arrFib[num-1];
        }
        return result;
    }
}
