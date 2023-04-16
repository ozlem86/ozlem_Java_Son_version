package day07ifstatementternarystatement;

import java.util.ArrayList;
import java.util.List;

public class IfStatement01 {
    public static void main(String[] args) {

        // Type code to check if a given character is upper or lower case or others

        char ch='b';
        if(ch>='A' && ch<='Z'){
            System.out.println("upper cases...");

        }else if(ch>='a'&& ch<='z' ) {
            System.out.println("lower cases..");


        }else{
            System.out.println("others...");
        }

        //Example 2) If a number is less than 300 or greater than 3000 print "P"
        //otherwise, print "r"

        int a = 500;

        if(a<300 || a>3000){
            System.out.println('p');

        }else{
            System.out.println('r');
        }

        //Example 3) Type code to check if a number is Even or Odd
        int n=7;

        if(n%2==0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");

        }

        //Example 4) type to print the number of month name
        String monthName="march";
        if(monthName.equals("march")){
            System.out.println(3);

        }else if(monthName.equals("january")){
            System.out.println(1);

        }else if(monthName.equals("february")){
            System.out.println(2);
        }

    }

}







