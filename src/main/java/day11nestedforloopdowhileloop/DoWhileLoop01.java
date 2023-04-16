package day11nestedforloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //Example 1) what is the difference between "while loop" and " do while loop"?

        //While loop // zero execution is possible
        int i= 1;

        while(i<1){
            System.out.println("I am a while loop");

            i++;
        }

        // Do While Loop// Zero execution is impossible, loop body will be executed at least once!


        int k =1;

        do{

            System.out.println("I am do while loop");
         k++;
        }while(k<1);

        //Example 2) Ask user to enter an integer
        //if the integer is less than 100, tell user "Won!"
        //otherwise, tell user "lost!"

        Scanner input =new Scanner(System.in);




        do {
            System.out.println("enter an integer");
            int num= input.nextInt();
            if(num<100){
                System.out.println("won!");

            }else{
                System.out.println("Lost!");
                break;
            }


        }while(true);

    }
}
