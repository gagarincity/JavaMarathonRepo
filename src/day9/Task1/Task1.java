package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "115");
        Teacher teacher = new Teacher("Oleg Petrovich", "Fizika");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }
}
