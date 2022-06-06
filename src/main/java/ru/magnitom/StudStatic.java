package ru.magnitom;

public class StudStatic {

    public static final String type = "Студент";

    String fio;
    int age;
    long id;
    static long counter;
    static {
        counter = 100;
        System.out.println("Начальное значение индентификатора: " + counter);
    }

    public StudStatic(long id) {
        System.out.println("Вызван конструктор");
        id = counter++;
    }

    public static void setCurrentCounter(long counterValue) {
        counter = counterValue;
    }
}
