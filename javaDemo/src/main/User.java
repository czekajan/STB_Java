package main;

public class User {

    // 1. Pola obiektu - opisuja z czego sklada sie obiekt

    // Modyfikatory dostepu
    // domyslny
    // public - dostepne wszedzie
    // private - dostepne w danej klasie
    // protected - dostepne w tym samym pakiecie i dziedziczenie

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Boolean likeIceCream;

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

    // 3. Metody - co dany obiekt bedzie mogl zrobic

    public void introduceYourself(){
        System.out.println("Hi! My name is " + firstName + " " + lastName);
    }

    Boolean isAdult(){
        if (age > 18){
            return true;
        } else {
            return false;
        }
    }

    public void metodaZParametrem(String parametr){
        System.out.println("Parametr metody: " + parametr);
    }

    public void metodaZParametrami(String parametr, String parametr2){
        System.out.println("Parametr metody: " + parametr + " parametr 2 " + parametr2);
    }


//    // przeciazenie metody - dwie takie same metody, z taka sama nazwa, ale musza sie roznic parametrami
//    void metodaZParametrem(String parametr){
//        System.out.println("Parametr metody: " + parametr);
//    }
//
//    void metodaZParametrem(String parametr, Boolean parametr2){
//        System.out.println("Parametr metody: " + parametr + "parametr 2 :" + parametr2);
//    }

}
