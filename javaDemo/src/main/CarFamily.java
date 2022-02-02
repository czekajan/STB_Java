package main;

public class CarFamily extends CarSportsAndFamily {

    // Kiedy mozemy dziedzieczyc?
    // is a - jest czymś
    // has a - posiada coś (nie o dziedziczeniu, ale o kompozycji)

    private String carType = "Family car";

    // konstruktor
    public CarFamily(String name, String color, String engineSize, String carType) {
        super(name, color, engineSize);  //nwywolanie konstruktora z klasy matki
        this.carType = carType;
    }

    public void describeCar() {
        System.out.println("Car name " + name + " color: " + color + " engine size: " +engineSize + "car type: " + carType);
    }
}
