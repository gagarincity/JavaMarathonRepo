package day9.Task1;

import day9.Task1.Human;

/*
И наконец, в нашей программе должна быть еще одна сущность - Преподаватель (англ. Teacher).
Преподаватель должен тоже наследоваться от класса Человек.
При этом, у преподавателя есть дополнительное строковое поле - название предмета, который ведет этот преподаватель.
Для этого поля необходимо создать геттер и сеттер.
Конструктор в классе Преподаватель должен принимать на вход два аргумента
- имя преподавателя и название преподаваемого предмета.
Метод printInfo() в классе Преподаватель должен быть переопределен таким образом,
чтобы формат выводимого в консоль сообщения был таким:
“Этот человек с именем ИМЯ”
“Этот преподаватель с именем ИМЯ”.
(должно выводиться именно две строки - необходимо использовать ключевое слово super)
*/
public class Teacher extends Human {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
