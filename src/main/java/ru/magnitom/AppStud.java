package ru.magnitom;

public class AppStud {
    public static void main(String[] args) {
        Student Young = new Student("Young", 20, 555,5,5);
        Young.showInfo();
        Young.rest(2);
        Young.showInfo();
        Young.study(4);
        Young.showInfo();

        Student Old = new Student("Old", 50, 555,5,5);
        Old.showInfo();
        Old.rest(2);
        Old.showInfo();
        Old.study(4);
        Old.showInfo();
    }
}
