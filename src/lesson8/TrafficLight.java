package lesson8;

import static lesson8.TrafficLightColors.*;

public class TrafficLight {
    private TrafficLightColors color;

    TrafficLight() {
        color = RED;
    }

    public TrafficLightColors getColor() {
        return color;
    }

    private TrafficLightColors currentColorToNextColor() {
        switch (color) {
            case RED: return ORANGE;
            case ORANGE: return GREEN;
            case GREEN: return YELLOW;
            case YELLOW: return RED;
        }
        return null;
    }

    public void switchNextColor() {
        color = currentColorToNextColor();
    }
}
