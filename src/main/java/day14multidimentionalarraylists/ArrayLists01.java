package day14multidimentionalarraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //Arraylarde eleman sayisini baslangicta belirtmek gerekiyor sonrasinda degistiremezsin Listlerde degistirirsin
        // listler flexible array ise fixed.
        //list can store just nonprimitive data, array stores primitive data and reference
        // array works very fast, memory uses less
        // if you sure the number of elements will not change( month names)
        /*
        1)To create an "Array" we need to declare "the number of elements" at the beginning,
          we may need more elements to store or less elements to store inside the array.
          That is why declaring the number of elements at the beginning is not good.
          This is the negative side of arrays.

          To remove that negativity, Java created a new structure whose name is "ArrayList"(List is also used),
          when we use "ArrayList", no need to declare the number of elements you want to store in it.

          As a result; "Array" is fixed in length, "ArrayList" is flexible

        2) "ArrayList" can store just "non-primitive" data, "Array" can store "primitive" data and "reference"

        3) "Array"s work so fast
           "Array"s use memory so less
           If you are sure the number of elements will not change(For example month names), using "Array" is better
     */




        List<Integer> ages = new ArrayList<>();
        System.out.println(ages);
        ages.add(13);
        ages.add(9);
        ages.add(21);// add methodu elementleri insertion order e göre koyar. yazdigin siraya göre
        System.out.println(ages);

        ages.add(1,44);
        System.out.println(ages);

        List<Integer> prices=new ArrayList<>();

        prices.add(330);
        prices.add(550);
        prices.add(770);
        System.out.println(prices);

        ages.addAll(prices);
        System.out.println(ages);

        //prices.clear(); // butun elementleri siler
        //System.out.println(prices);

        boolean r1= ages.contains(44);
        System.out.println(r1);

        boolean r2= ages.containsAll(prices);// tum elementlerin listede olmasi lazim.yoksa false verir
        System.out.println(r2);

        List<String>names=new ArrayList<>();
        names.add("Tom");
        names.add("Angia");
        names.add("Mark");

        List<String>names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Angia");
        names2.add("Mark");

        boolean r3= names.equals(names2);// ayni elemenler ayni index sirasinda olmak zorunda.
        System.out.println(r3);

        // Example 1) type code to check if two lists have same element
        // not : ayni lementler farkli indexte olabilir "same" derse. equals da olmaz!!!

        List<Character> m = new ArrayList<>();
        m.add('A');
        m.add('C');
        m.add('B');

        List<Character> n = new ArrayList<>();
        n.add('B');
        n.add('C');
        n.add('A');

        Collections.sort(m);
        Collections.sort(n);
        boolean r4= m.equals(n);
        System.out.println(r4);

        /*
          1)primitive variables and Strings can store just a single data in them.
         Sometimes we need to "store multiple data " in a single container.To be able to
        store multiple data in a single container, Java created a new structure called "Arrays".

        2) Arrays cannot store "non-primitives", if you see "non-primitives" were stored actually they are the
         references of non-primitives. Arrays can store i)primitive data types and ii) references of non-primitives
           */





















    }
}
