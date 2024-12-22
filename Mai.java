
abstract class Student {
    private String fullName;
    private int course;
    private double lastExamGrade;

    public Student(String fullName, int course, double lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    public abstract void writeExam();

    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public double getLastExamGrade() {
        return lastExamGrade;
    }
}

class IUStudent extends Student {
    public IUStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " из Института управления пишет экзамен!");
    }
}

class MathStudent extends Student {
    public MathStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " из математического факультета пишет экзамен!");
    }
}

public class Mai {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Иванов Иван Иванович", 2, 4.5);
        Student mathStudent = new MathStudent("Петров Петр Петрович", 3, 5.0);

        iuStudent.writeExam();
        mathStudent.writeExam();

        System.out.println(iuStudent.getFullName() + " имеет оценку за последний экзамен: " + iuStudent.getLastExamGrade());
        System.out.println(mathStudent.getFullName() + " имеет оценку за последний экзамен: " + mathStudent.getLastExamGrade());
    }
}

