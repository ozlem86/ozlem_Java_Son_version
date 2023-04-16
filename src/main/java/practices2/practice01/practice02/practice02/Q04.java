package practices2.practice01.practice02.practice02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {


    /*
        Create a String variable and find the sum of ASCII values of the first and the last characters of the String.
        String s= "Miami";
         */
        String s = "Miami";

        int indexOfLastChar = s.length() - 1;

        int AsciiFirst = s.charAt(0); //"M"

        int AsciiLast = s.charAt(indexOfLastChar);//"i"

        System.out.println("Total ASCII values of first and last characters: " + (AsciiFirst + AsciiLast));
    }


    public static class Q02 {

            /*
        Modulus Operator==>in Java % is called modulus operator
        It returns the "remainder" in a division operation
        13/5 ==>3 ==> 13%5 ==> 3
         */
            public static void main(String[] args) {
                //Ask user to enter an integer then print "Even" on the console if the number is even.

                Scanner input= new Scanner(System.in);
                System.out.println("Enter an integer");
                int number=input.nextInt();
                boolean checkedNum=number%2==0;
                System.out.println("Is the number even? "+ checkedNum);

                //Check a number if it is odd or not
                Scanner input2= new Scanner(System.in);
                System.out.println("Enter a digit to check if it is an odd number");
                int checkOdd = input2.nextInt();
                System.out.println("Is the number odd? " + (checkOdd%2 !=0));

            }

    }
}
