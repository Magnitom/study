package ru.magnitom;

interface Studyble {
    void study(int hours);

}

interface Restable {
    void rest(int hours);

}

interface Workable {
    void work(int hours);

}

public class StudentViaInterface implements Studyble, Restable, Workable {

    private String fio;
    private int age;
    private long id;
    private int knowledgeLevel;
    private int energyLevel;
    private int speedKnow;
    private int speedEnergy;

    public StudentViaInterface(String fio, int age, long id, int knowledgeLevel, int energyLevel) {
        this.fio = fio;
        this.age = age;
        this.id = id;
        this.knowledgeLevel = knowledgeLevel;
        this.energyLevel = energyLevel;
        speed();
    }

    private void speed() {
        if (this.age > 30) {
            this.speedEnergy = 1;
            this.speedKnow = 2;
        } else {
            this.speedEnergy = 2;
            this.speedKnow = 1;
        }
    }

    @Override
    public void study(int hours) {
        System.out.println("Учимся");
    }


    @Override
    public void rest(int hours) {
        System.out.println("Отдыхаем");
    }


    @Override
    public void work(int hours) {
        System.out.println("Работаем");
    }

}
