package day14multidimentionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //Example 1 ) Type code to print the elements of a list
        //if the elements is grater than the number of in the list

        List<Integer> a= new ArrayList<>();
        a.add(5);
        a.add(9);
        a.add(3);
        a.add(4);
        a.add(6);


        int numOfElement=a.size();


        for(Integer w:a){
            if(w>numOfElement){
                System.out.print(w+" ");
            }
        }













    }
}
