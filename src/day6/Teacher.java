package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void rateStudent(Student student) {
        int score = (int) (Math.random() * 4 + 2);
        String scoreText = "никогда не появится этот текст";
        switch (score) {
            case 2:
                scoreText = "неудовлетворительно";
                break;
            case 3:
                scoreText = "удовлетворительно";
                break;
            case 4:
                scoreText = "хорошо";
                break;
            case 5:
                scoreText = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем "
                + student.getName() + " по предмету " + this.subject + " на оценку " + scoreText);
    }
}
