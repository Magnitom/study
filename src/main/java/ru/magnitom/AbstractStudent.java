package ru.magnitom;

public abstract class AbstractStudent {
    private String fio;
    private int age;
    private long id;
    private int knowledgeLevel;
    private int energyLevel;
    private int speedKnow;
    private int speedEnergy;

    public AbstractStudent(String fio, int age, long id, int knowledgeLevel, int energyLevel) {
        this.fio = fio;
        this.age = age;
        this.id = id;
        this.knowledgeLevel = knowledgeLevel;
        this.energyLevel = energyLevel;
    }

    abstract void study(int hours);

    abstract void rest(int hours);

    void showInfo() {
        System.out.println("--------\n" + "ФИО " + fio + "\nВозраст " + age + "\nID " + id + "\nЗнания " + knowledgeLevel + "\nЭнергия " + energyLevel + "\n--------\n");
    }
}
