package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoAppStreams {

    public static void main(String[] args) {

        // STREAMY - to strumienie wartosci

        // (a) POSREDNIE - zwracaja nowe streamy (np filter, map)
        //                  filter - filtrowanie elementow
        //                  map - przeksztalcanie elementow
        // (b) TERMINALNE - sa wykonywane jako ostatnie; zwracaja wartosc; pozwalaja zebrac wartosci
        //                  forEach, min | max | sum, anyMatch | allMatch | nonMatch, count, collect

        List<String> names = new ArrayList<>();
        names.add("Bartek");
        names.add("Antek");
        names.add("Filip");
        names.add("Franek");
        names.add("Frania");
        names.add("Robert");

        // petla for - imiona zaczynajace sie od litery F
        for (String name: names) {
            if (name.startsWith("F")){
                System.out.println(name);
            }
        }

        // wszystkie imiona zaczynajaca sie od litery F
        names.stream()
                .filter(name -> name.startsWith("F"))
                .forEach(name -> System.out.println(name));
        //      .forEach(System.out::println);

        // policzenie imion zaczynajacych sie od F
        long numberOfFNames = names.stream()
                .filter(name -> name.startsWith("F"))
                .count();

        System.out.println(numberOfFNames);


        // zamiana imion na wielkie litery
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        // dodanie tekstu do kazdej zmiennej
        names.stream()
                .map(name -> name + " jakiś dodatkowy tekst")
                .forEach(System.out::println);

        // ktorekolwiek imie konczace sie na litere K
        boolean anyMatchEndsWithK = names.stream()
                .anyMatch(name -> name.endsWith("k"));
        System.out.println(anyMatchEndsWithK);

        // wszystkie imiona konczace sie na litere K
        boolean allMatchEndsWithK = names.stream()
                .allMatch(name -> name.endsWith("k"));
        System.out.println(allMatchEndsWithK);

        // wszystkie imiona ktore zaczynaja sie na F ale nie koncza sie na K
        List<String> namesStartsWithF = names.stream()
                .filter(name -> name.startsWith("F"))
                .filter(name -> !name.endsWith("k"))
                .collect(Collectors.toList());      // Alt+Enter

       namesStartsWithF.stream()
               .forEach(System.out::println);


       // LISTA OBIEKTÓW

        List<User> users = new ArrayList<>();
        users.add(new User("Basia", "Green", "basia@javademo.pl", 12, false));
        users.add(new User("Lena", "Yellow", "lena@gmail.com", 23, false));
        users.add(new User("Jakub", "Blue", "jakub@onet.pl", 53, true));
        users.add(new User("Kamil", "Pink", "kamil@o2.co.uk", 32, true));
        users.add(new User("Krzysiek", "Orange", "krzysiek@test.eu", 23, false));
        users.add(new User("Julia", "Wait", "julia@wp.pl", 87, true));

        System.out.println(" ");
        System.out.println("Użytkownicy, których email kończy się na .pl");
        users.stream()
                .filter(user -> user.getEmail().endsWith(".pl"))
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Użytkownicy, których nie lubią lodów");
        users.stream()
                .filter(user -> user.getLikeIceCream().equals(false))
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Użytkownicy, którzy są dorośli");
        users.stream()
                .filter(user -> user.getAge() > 18)
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Najmłodszy użytkownik");
        User theYoungestUser = users.stream()
                .min(Comparator.comparing(user -> user.getAge()))
                .get();
        theYoungestUser.introduceYourself();

    }

    }

