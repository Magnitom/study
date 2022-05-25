//package ru.magnitom;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class VaragsItPark {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String stringInput = sc.nextLine();
//        List<String> listString = new ArrayList<>();
//        while (sc.hasNext()){
//            listString.add(sc.nextLine());
//        }
//        System.out.println(CompSt(stringInput, listString));
//    }
//
//    public static boolean CompSt (String stringIn, String... arr){
//        String resultArr = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            resultArr = arr[i] + resultArr;
//        }
//        boolean result = stringIn.equals(resultArr);
//        return result;
//    }
//}
