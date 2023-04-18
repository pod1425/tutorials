package lesson_interractions.aggregation;

public class Student {
    public String name;
    public String groupNumber;

    public Student(String name, String groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public void doHomework(Homework homework) {
        homework.text = name + " " + groupNumber + " (homework text)";
    }
}
