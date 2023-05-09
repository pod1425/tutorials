package lesson8;

public class Demo {

    private static boolean canDrive(TrafficLightColors color) {
        switch (color) {
            case RED, ORANGE: return false;
            case GREEN, YELLOW: return true;
        }
        return false;
    }

    private static String boolToMessage(boolean canDrive) {
        return canDrive ? "You can pass" : "You should stop!";
    }

    public static void main(String[] args) {
        TrafficLight tf = new TrafficLight();
        System.out.println(tf.getColor());
        System.out.println(boolToMessage(canDrive(tf.getColor())));
        tf.switchNextColor();
        System.out.println(tf.getColor());
        System.out.println(boolToMessage(canDrive(tf.getColor())));
        tf.switchNextColor();
        System.out.println(tf.getColor());
        System.out.println(boolToMessage(canDrive(tf.getColor())));
        tf.switchNextColor();
        System.out.println(tf.getColor());
        System.out.println(boolToMessage(canDrive(tf.getColor())));
        tf.switchNextColor();
        System.out.println(tf.getColor());
        System.out.println(boolToMessage(canDrive(tf.getColor())));
    }
}
