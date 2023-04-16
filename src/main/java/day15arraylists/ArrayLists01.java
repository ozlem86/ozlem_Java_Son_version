package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        // Example 1) Create a String list add 5 element into the list and remove a specific element from the list.

        List<String> names = new ArrayList<>();
        names.add("Christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");
        System.out.println(names);

        boolean isRemoved = names.remove("Alex");
        System.out.println(isRemoved);// eger silindiyse yani o obje listte varsa return true  olur.
        System.out.println(names);// Alex listeden cikti, silindi.

        String removedElement = names.remove(2);
        System.out.println(removedElement);// index ile silmelerde silinen elemenin ismini veriyor.
        //indexlerde Java dubble check yapiyor.
        System.out.println(names);// Adriana silindi.

        //Example 2) create an integer list add 6 lement into it remove a specific element

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(13);
        ages.add(7);
        ages.add(32);
        ages.add(1);
        ages.add(55);
        System.out.println(ages);

        ages.remove((Integer) 13); // (13) (Integer)13) olarak yazilmali yoksa yanlis verir, indet 13 olarak alir.
        System.out.println(ages);


        //Example 3) Create a String list add 5 element into it remove the element whose length is less than 6

        List<String> n = new ArrayList<>();
        n.add("Christian");
        n.add("Alex");
        n.add("Tommy");
        n.add("Adriana");
        n.add("Tom");
        System.out.println(n);

        for (int i = 0; i < n.size(); i++) {
            if (n.get(i).length() < 6) {
                n.remove(n.get(i));
                i--;
            }
        }
        System.out.println(n);

        //2.Way: Clone bir list olustur

        List<String> clonedN = new ArrayList<>(n);// clone bir list olusturdum

        for (String w : clonedN) {
            if (w.length() < 6) {
                n.remove(w);
            }
        }
    }
}
