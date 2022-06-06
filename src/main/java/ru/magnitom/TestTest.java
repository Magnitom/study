package ru.magnitom;

public class TestTest {
    public static void main(String[] args) {
//        StudStatic test = new StudStatic(5);
//        System.out.println(StudStatic.counter);
//        StudStatic test2 = new StudStatic(6);
//        System.out.println(StudStatic.counter);
//        StudStatic.setCurrentCounter(200);
//        StudStatic test3 = new StudStatic(7);
//        System.out.println(StudStatic.counter + " /// " + StudStatic.type);

//        System.out.println(MathClone.add(2,2));
//        System.out.println(MathClone.counter);
//        System.out.println(MathClone.div(3,3));
//        System.out.println(MathClone.counter);
//        System.out.println(MathClone.multi(4, 4));
//        System.out.println(MathClone.counter);
//        System.out.println(MathClone.sub(10,5));
//        System.out.println(MathClone.counter);

//        StudentViaInterface ivan = new StudentViaInterface("Ivan", 22, 77, 5,5);
//        ivan.study(1);
//        ivan.rest(2);
//        ivan.work(2);

        AbstractStudent itStud = new StudentIT("Ivan", 24, 555, 6, 5);
        itStud.study(5);
        itStud.rest(4);
        AbstractStudent sportStud = new StudentSport("Kolia", 30, 33, 10, 10);
        sportStud.study(4);
        sportStud.rest(3);
    }
}