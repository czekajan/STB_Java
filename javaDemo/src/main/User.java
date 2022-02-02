package main;

public class User {

    // 1. Pola obiektu - opisuja z czego sklada sie obiekt

    String firstName;
    String lastName;
    String email;
    int age;
    Boolean likeIceCream;

    // 2. Konstruktor (konstruktor domysliny, i taki ktory mozemy nadpisac
    // jezeli nie utworzymy zadnego konstruktora, to java utowrzy konstruktor domyslny! czyli pusty
    // jesli konstruktor zostanie utworzony, to nigdy nie zadziala konstruktos domyslny
    // konstruktor ma taka sama nazwa jak nazwa klasy
    // konstruktor jest publiczny

    public User(String firstName, String lastName, String email, int age, Boolean likeIceCream) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.likeIceCream = likeIceCream;

    }


}
