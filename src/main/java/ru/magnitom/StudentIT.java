package ru.magnitom;

public class StudentIT extends AbstractStudent{
    public StudentIT(String fio, int age, long id, int knowledgeLevel, int energyLevel) {
        super(fio, age, id, knowledgeLevel, energyLevel);
    }

    @Override
    void study(int hours) {
        System.out.println("Читаем книги");
    }

    @Override
    void rest(int hours) {
        System.out.println("Спим и думаем о ИТ");
    }
}

class StudentSport extends AbstractStudent{
    public StudentSport(String fio, int age, long id, int knowledgeLevel, int energyLevel) {
        super(fio, age, id, knowledgeLevel, energyLevel);
    }

    @Override
    void study(int hours) {
        System.out.println("Тягаем гири");
    }

    @Override
    void rest(int hours) {
        System.out.println("Спим и думаем о спорте");
    }
}