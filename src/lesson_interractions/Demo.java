package lesson_interractions;

import lesson_interractions.aggregation.Homework;
import lesson_interractions.aggregation.Student;
import lesson_interractions.association.Lecture;
import lesson_interractions.association.Teacher;
import lesson_interractions.composition.Car;
import lesson_interractions.dependency.Machinery;
import lesson_interractions.dependency.Part;

public class Demo {
    /*
        Car myCar = new Car(4, 200, 3.5, "diesel");
        System.out.println(myCar);
        myCar.driveOneKilometer();
        myCar.driveOneKilometer();
        myCar.driveOneKilometer();
        System.out.println(myCar);
     */
    /*
        Teacher teacher = new Teacher("Jack", "Programming");
        Lecture lecture1 = new Lecture("Encapsulation", 45, teacher);
        lecture1.beginLecture();
        Lecture lecture2 = new Lecture("Inheritance", 35, teacher);
        lecture2.beginLecture();
     */
    public static void main(String[] args) {
        /*
        Student student = new Student("Jack", "110s");
        Homework homework = new Homework(student);
        System.out.println(homework.text);
         */
        int turns = 5;
        Machinery machinery = new Machinery(turns);
        Part part = new Part("Engine", turns);
        machinery.assemblePart(part);
        System.out.println(part.state);
    }
}
