package main;

public class DemoApp {
    public static void main(String[] args) {

        // LESSSSSSSSSSON DZIEDZICZENIE
        CarFamily familyCar = new CarFamily("Opel", "red", "1.4", "Car Family");
        familyCar.describeCar();


        /*
        // LESSSSSSSSSSON Enkapsulacja, Gettery, Settery
        Car bmw = new Car("bmw z1", "green", "3,5");
        System.out.println(bmw.getName());
        */

        /*
        // LESSSSSSSSSSON Konstruktor i metody
        User user1 = new User("Piotr", "Testowy", "piotrt@javademo.pl", 9, false);
        //System.out.println("User name: " + user1.firstName + " " + user1.lastName + " email: " + user1.email);
        user1.introduceYourself();
        Boolean adult = user1.isAdult();
        System.out.println(adult);
        user1.metodaZParametrem("jeden");
        user1.metodaZParametrami("jeden", "dwa");

        User user2 = new User("Piotr", "Testowy", "piotrt@javademo.pl", 9, true);
        user2.introduceYourself();
        System.out.println(user2.isAdult());
        */


        /*
        // LESSSSSSSSSSON Pola obiektu
        User user1 = new User();
        user1.firstName = "Ania";
        user1.lastName = "Wait";
        user1.email = "anka@javademo.pl";
        user1.age   = 30;
        user1.likeIceCream = true;
        System.out.println("User name: " + user1.firstName + " " + user1.lastName + " email: " + user1.email);
        */


        /*
        // LESSSSSSSSSSON 1
        System.out.println("Hello from java 11");

        // typy danych
        System.out.println(10);
        System.out.println(20.2);
        System.out.println("To jest tekst w javie");
        System.out.println('x');
        System.out.println(true);
        System.out.println(false);

        // zmienne
        // typ nazwa = wartosc;
        int number = 10;
        double doubleNumber = 20.2;
        String name = "Ania";
        char x = 'x';
        Boolean isTrue = true;
        Boolean isFalse = false;

        System.out.println(number);
        System.out.println(doubleNumber);
        System.out.println(name);
        System.out.println(x);
        System.out.println(isTrue);
        System.out.println(isFalse);

        int age = 30;
        System.out.println("Cześć! Mam na imię " + name + " , mam " + age + " lat. " + name + " to bardzo fajne imie.");

        // operatory
        double num1 = 10;
        double num2 = 4;

        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(num1 / num2);

        System.out.println(10 > 3);
        System.out.println(10 < 3);
        System.out.println(10 == 9);
        System.out.println(10 != 9);

        System.out.println(10 == 10 && 20>19);
        System.out.println(10 == 10 || 20>19);
        */
    }
}
