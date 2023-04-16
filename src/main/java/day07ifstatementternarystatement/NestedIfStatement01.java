package day07ifstatementternarystatement;

import java.util.Scanner;

public class NestedIfStatement01 {
    public static void main(String[] args) {
        // Example 1) If the worker is male and the age is grater than 65 he will be retired otherwise he should work
        // If the worker is female and the age is greater than 60 she will be retired otherwise she should work
       // If the worker does not define himself as male or female print "undefined"

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender= input.next();
        System.out.println("Enter your ages");
        int ages= input.nextInt();

        if(gender.equalsIgnoreCase("Male")){
            if(ages<0){
                System.out.println("invalid ages");

            }else if(ages<66){
                System.out.println("should work");


            }else{
                System.out.println("he should retired");
            }




        }else if(gender.equalsIgnoreCase("Female")){
            if(ages<0){
                System.out.println("invalid");

            } else if(ages<61){
                System.out.println("she should work");

            }else{
                System.out.println("should be retired");
            }


        }else{
            System.out.println("undefined");

        }


    }
}
