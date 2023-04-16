package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {

        // Example 1) Create an integer list add 5 element into it
        // change the elements less than  10 to 70

        List<Integer> myList= new ArrayList<>();
        myList.add(13);
        myList.add(8);
        myList.add(25);
        myList.add(2);
        myList.add(10);

        for(Integer w: myList){
            if(w<10) {
                myList.set(myList.indexOf(w), 70);
            }
        }
        System.out.println(myList);

        //2.Way

        for(int i= 0; i< myList.size();i++){
            if(myList.get(i)<10){
                myList.set(i,70);
            }
        }
        System.out.println(myList);

        // Example 1) Create an integer list remove the duplicated element

        List<Integer> yourList= new ArrayList<>();
        yourList.add(2);
        yourList.add(3);
        yourList.add(2);
        yourList.add(2);
        yourList.add(5);
        yourList.add(2);

        List<Integer> noDuplication= new ArrayList<>();
        for(Integer w:yourList){
            if(!noDuplication.contains(w)){
                noDuplication.add(w);
            }

        }
        System.out.println(noDuplication);


        //2.Way
        for(int i =0;i< yourList.size();i++){

            Integer element= yourList.get(i);

            if(yourList.indexOf(element)!=yourList.lastIndexOf(element)){
                yourList.remove(element);

                i--;
            }
        }
        System.out.println(yourList);
        int x =100;
        int y= x*2;
        x= 80;

    }

}
