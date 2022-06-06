package ru.magnitom;

public class ExtTest {
    public ExtTest() {
        System.out.println("ExtTest...");
    }
}

class X extends ExtTest{
    public X() {
        System.out.println("X...");
    }
}

class Y extends X{
    public Y() {
        System.out.println("Y...");
    }
}

class qwe{
    public static void main(String[] args) {
        X yTest = new Y();
//        ExtTest trt = new ExtTest();
    }
}
