package day16arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArraysList02 {
    public static void main(String[] args) {

        //Example 1)  Create a integer salary list and increase the salary %10 if the salary is less than 5000 dollars.


        List<Double> salary = new ArrayList<>();
        salary.add(4500.0);
        salary.add(6400.0);
        salary.add(2300.0);
        salary.add(5000.0);
        salary.add(7150.0);

        //1.Way
        for(Double w: salary){
            if(w<5000){
                salary.set(salary.indexOf(w),w*1.1);
            }
        }
        System.out.println(salary);

        //2.Way

        for(Double w: salary){
            if(w>5000){
                continue;

            } else{
                salary.set(salary.indexOf(w), w*1.1);
            }
        }
        System.out.println(salary);










    }
}
