package day16arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //1) find two closest integer in a given list

        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(15);
        nums.add(10);
        nums.add(14);

        Collections.sort(nums);
        int minDiff= nums.get(1)- nums.get(0);

         for(int i =1 ; i<nums.size(); i++){
             minDiff = Math.min(minDiff,nums.get(i)-nums.get(i-1));
         }
        System.out.println(minDiff);

         for(int i=1; i< nums.size();i++){
             if(nums.get(i)- nums.get(i-1)==minDiff){
                 System.out.println(nums.get(i) + " and " +  nums.get(i-1));
             }
         }

    }
}
