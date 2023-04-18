package lesson_interractions.aggregation;

public class Homework {
    public String text;
    public Student author;

    public Homework(Student author) {
        this.author = author;
        author.doHomework(this);
    }
}
