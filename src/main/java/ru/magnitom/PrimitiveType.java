package ru.magnitom;

public class PrimitiveType {
    public static void main(String[] args) {
        byte byType = 25;
        short shortType = 3434;
        int intType = 434345;
        long longType = 43458495899999l;
        float floatType = 2.4f;
        double doubleType = 2.44;
        char charType = 'g';
        boolean boolType = false;
        boolean boolTrue = true;
        int[] arrInt = new int[1];
        byte[] arrByte = new byte[1];
        short[] arrShort = new short[1];
        long[] arrLong = new long[1];
        float[] arrFloat = new float[1];
        double[] arrDouble = new double[1];
        char[] arrChar = new char[1];
        boolean[] arrBool = new boolean[1];
        System.out.println("arrByte = " + arrByte[0]);
        System.out.println("arrShort = " + arrShort[0]);
        System.out.println("arrInt = " + arrInt[0]);
        System.out.println("arrChar = " + arrChar[0]);
        System.out.println("arrLong = " + arrLong[0]);
        System.out.println("arrFloat = " + arrFloat[0]);
        System.out.println("arrBool = " + arrBool[0]);
        System.out.println("arrDouble = " + arrDouble[0]);
        String fio = "Стерхов Павел Петрович";
        String[] arrFio = fio.split(" ");
        for (int i = 0; i < arrFio.length; i++) {
            System.out.println(arrFio[i]);
        }
        String stringJava = "java";
        String startJava = stringJava.substring(0, 1).toUpperCase();
        String endJava = stringJava.substring(stringJava.length() - 1).toUpperCase();
        stringJava = startJava + stringJava.substring(1, stringJava.length() - 1) + endJava;
        System.out.println(stringJava);

        int a = 5;
        int b = a + a;
        System.out.println("a + a = " + b);
        int c = a - a;
        System.out.println("a - a = " + c);
        int d = a * a;
        System.out.println("a * a = " + d);
        int e = a / a;
        System.out.println("a / a = " + e);
        int f = a % 2;
        System.out.println("a % a = " + f);
        int g = a++;
        System.out.println("a++ = " + g);
        int h = a--;
        System.out.println("a-- = " + b);
        a += a;
        System.out.println("a+= = " + a);
        a -= a;
        System.out.println("a-= = " + a);
        a *= a;
        System.out.println("a*= = " + a);
        a /= 2;
        System.out.println("a/= = " + a);
        a %= 2;
        System.out.println("a%= = " + a);

        int z = 5;
        int x = 6;
        System.out.println("z==x : " + (z==x));
        System.out.println("z!=x : " + (z!=x));
        System.out.println("z>x : " + (z>x));
        System.out.println("z<x : " + (z<x));
        System.out.println("z>=x : " + (z>=x));
        System.out.println("z<=x : " + (z<=x));

        boolean aa = true;
        boolean bb = false;
        System.out.println("aa & bb = " + (aa && bb));

    }
}
