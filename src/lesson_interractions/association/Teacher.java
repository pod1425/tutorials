package lesson_interractions.association;

public class Teacher {
    public String name;
    public String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void beginLesson(String topic) {
        System.out.println("Hello! Im " + name + ", today we are gonna learn " + topic);
    }

    public void endLesson() {
        System.out.println("Alright, thats all for today on subject "
                + subject + "! See you on next lecture");
    }
}
