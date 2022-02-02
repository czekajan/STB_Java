package main;

import java.util.*;

public class DemoApp2 {

    public static void main(String[] args){

        // KOLEKCJA - zbiór elementór tego samego typu (w javie)

        // 1. Lista - element1, elemnt2, element3

        List<String> namesList = new ArrayList<String>();
        namesList.add("Bartek");
        namesList.add("Antek");
        namesList.add("Anka");
        namesList.add("Piotr");
        namesList.add("Lena");

        System.out.println(namesList.size());
        System.out.println(namesList.get(3));

        // PETLA FOR
        for (int i = 0; i < namesList.size(); i++){
            System.out.println(namesList.get(i));
        }

        // PETLA FOR EACH
        for (String name : namesList) {
            System.out.println(name);
        }

        // LISTA moze zawierac obiekty
        List<User> users = new ArrayList<>();
        users.add(new User("Anka", "Wait", "anka@javademo.pl", 30, true));
        users.add(new User("Piotr", "Green", "piotr_green@javademo.pl", 15, false));
        users.add(new User("Lidia", "Blue", "lidia_blue@javademo.pl", 62, true));

        for (User user: users){
            user.introduceYourself();
        }



        // MAPA - klucz, wartosc

        Map<Integer, String>  namesMap = new HashMap<Integer, String>();

        namesMap.put(1, "Bartek");
        namesMap.put(2, "Anka");
        namesMap.put(3, "Marcin");
        System.out.println(namesMap.get(2));

        for (Map.Entry<Integer, String> entry : namesMap.entrySet()) {
            System.out.println(entry.getValue());
        }



        // SET - kolekcja, ktora przechowuje tylko unikalne wartosci

        Set<String> namesSet = new HashSet<String>();

        namesSet.add("Bartek");
        namesSet.add("Bartek");
        namesSet.add("Anka");

        System.out.println(namesSet.size());

        for (String name: namesSet) {
            System.out.println(name);

        }
    }

}
