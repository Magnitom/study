package ru.magnitom;

public class Student {
    private String fio;
    private int age;
    private long id;
    private int knowledgeLevel;
    private int energyLevel;
    private int speedKnow;
    private int speedEnergy;

    public int getSpeedKnow() {
        return speedKnow;
    }

    public void setSpeedKnow(int speedKnow) {
        this.speedKnow = speedKnow;
    }

    public void setSpeedEnergy(int speedEnergy) {
        this.speedEnergy = speedEnergy;
    }

    public int getSpeedEnergy() {
        return speedEnergy;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setKnowledgeLevel(int knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public long getId() {
        return id;
    }

    public int getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public Student() {
        speed();
    }

    public Student(String fio) {
        this.fio = fio;
        speed();
    }

    public Student(String fio, int age, long id, int knowledgeLevel) {
        this.fio = fio;
        this.age = age;
        this.id = id;
        this.knowledgeLevel = knowledgeLevel;
        speed();
    }

    public Student(String fio, int age, long id, int knowledgeLevel, int energyLevel) {
        this.fio = fio;
        this.age = age;
        this.id = id;
        this.knowledgeLevel = knowledgeLevel;
        this.energyLevel = energyLevel;
        speed();
    }

    public Student(String fio, int age, long id) {
        this.fio = fio;
        this.age = age;
        this.id = id;
        speed();
    }

    public Student(String fio, int age) {
        this.fio = fio;
        this.age = age;
        speed();
    }

    private void speed(){
        if (this.age > 30) {
            this.speedEnergy = 1;
            this.speedKnow = 2;
        } else {
            this.speedEnergy = 2;
            this.speedKnow = 1;
        }
    }

    void study(int hours) {
        if (hours >= 0) {
            for (int i = 0; i < hours; i++) {
                if (knowledgeLevel >= 10) {
                    System.out.println("Вы переучились, проучившись " + (i + 1) + " часов, а хотели " + hours + " часов");
                    break;
                }
                if (energyLevel <= 0) {
                    System.out.println("Вы устали учиться на "+ (i +1) + " часе учёбы, отдохните. Вы хотели учится " + hours + " часов");
                    break;
                }
                knowledgeLevel = knowledgeLevel + speedKnow;
                energyLevel = energyLevel - speedEnergy;
            }
        } else {
            System.out.println("Введите положительное число часов\n");
            return;
        }
        System.out.println("Учёба окончена\n");
    }

    void rest(int hours) {
        if (hours >= 0) {
            for (int i = 0; i < hours; i++) {
                if (energyLevel >= 10) break;
                knowledgeLevel = knowledgeLevel - speedKnow;
                energyLevel = energyLevel + speedEnergy;
            }
        } else {
            System.out.println("Введите положительное число часов\n");
            return;
        }
        System.out.println("Отдых закончен\n");
    }

    void showInfo() {
        System.out.println("--------\n" + "ФИО " + fio + "\nВозраст " + age + "\nID " + id + "\nЗнания " + knowledgeLevel + "\nЭнергия " + energyLevel + "\n--------\n");
    }


}
