package lesson_interractions.association;

public class Lecture {
    public String topic;
    public int length;
    public Teacher teacher;

    public Lecture(String topic, int length, Teacher teacher) {
        this.topic = topic;
        this.length = length;
        this.teacher = teacher;
    }

    public void beginLecture() {
        teacher.beginLesson(topic);
        System.out.println("(This lecture will be " + length + " minutes)");
        System.out.println("Lecture happens...");
        teacher.endLesson();
    }
}
