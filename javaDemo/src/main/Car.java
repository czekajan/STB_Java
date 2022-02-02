package main;

public class Car {

    // prawy myszy/Generate/zaznaczyc dane/Constructor
    private String name;
    private String color;
    private String engineSize;

    public Car(String name, String color, String engineSize) {
        this.name = name;
        this.color = color;
        this.engineSize = engineSize;
    }

    // prawy myszy/Generate/zaznaczyc dane/Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }
}
