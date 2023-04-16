package day11nestedforloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1) type code to print integers from 4 to 7 on the console

        //1.Way :

        for(int i = 4; i<8; i++){
            System.out.println(i+" ");
        }
        System.out.println();

        //2.Way:

        int i=4;

        while(i<8){
            System.out.print(i+" ");
         i++;
        }
        System.out.println();

        //Example 2) Type code to print odd integers from 12 to 67 in the same line
        // with a space between them.

        //1.Way
        for (int a = 12; a<68; a++ ){
            if(a%2!=0){
                System.out.print(a+" ");
            }
        }
        System.out.println();

        // 2.Way

        int b = 12;

        while(b<68){
            if(b%2!=0)
                System.out.print(b+" ");
         b++;
        }

        System.out.println();

        //Example 3 )Type code to find sum of integers from 12 to 67

        int sum =0 ;
        // 1.Way

        for(int m = 12; m <68; m++ ){
            sum= sum+m;

        }
        System.out.print(sum);

        System.out.println();
        //2.Way
        int sumOf = 0;
        int n= 12;

        while(n<68){

            sumOf=sumOf+n;

            n++;
        }
        System.out.println(sumOf);

        //Example 4) Type code by using while loop
        // Write a program that prompts(istemde bulunmak) the user to input an INTEGER
        // it should then find the sum of the digits of that number ..123-->1+2+3=6

        Scanner input= new Scanner(System.in);
        System.out.println("Enter integer");
        int num = input.nextInt();

        int toplam= 0 ;



        while(num>0){
           toplam = toplam + num%10;//--> give the last number of the digits

         num=num/10;
        }
        System.out.println(toplam);

        //Example 5) Type code by using while loop
        //        // Write a program that prompts(istemde bulunmak) the user to input an INTEGER
        //        // it should then print the multiplication table of that number.

        System.out.println(" Enter an integer to create multiplication table");
        int n1 = input.nextInt(); // 2*1=1 2*2=4 2*3=6


        int r =1;

        while(r<11){
            System.out.println(n1+"x"+r +"="+(n1*r));

            r++;
        }


    }
}
