package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Иванов Иван Иванович");
        Teacher teacher = new Teacher("Павлов Павел Павлович", "Механика");
        teacher.rateStudent(student);
    }
}
