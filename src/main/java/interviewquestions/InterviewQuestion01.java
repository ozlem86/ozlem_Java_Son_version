package interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewQuestion01 {
    public static void main(String[] args) {
        System.out.println();

       // Example 1: Type code to print unique characters in a String(Interview Question)

        String t= "Hello";

        for(int i =0;i<t.length();i++){
            char ch= t.charAt(i);
            if(t.indexOf(ch)==t.lastIndexOf(ch)){
                System.out.print(ch);

            }
        }

        System.out.println();

        //Example 2) Type code to print a String in reverse after removing space

               String a ="Ali Can";
                        for(int i=a.length()-1; i>=0;i--){
                            char ch =a.charAt(i);
                           System.out.print(ch);

                        }

        System.out.println();


        // Example 3) [0,2,3,0,12,0] sifirlari en sona koyunuz.

        int x [] ={0,2,3,0,12,0};
        int yeni[]=new int[x.length];

        int idx=0;
        for (int i = 0; i < x.length; i++) {

            if(x[i]!=0){
                yeni[idx]= x[i];
                idx++;

            }
        }
        System.out.println(Arrays.toString(yeni));

       /*
        Examples 4) )What are the differences between method and the constructor?  (interviews questions)
         a:Methods have return type but constructors dont have
             b:Methods are for some actions, but constructors are for object creation.


        Examples 5 ) "super()" ve "this()" ile "super",  "this"  arasindaki fark?
         -----> Inheritance de variable veya metodlari cagirmak icin "super","this" kullanilir.
         ----->Inheritance de constructor cagirmak icin "super()","this()" kullanilir.

         Example 6) What is encapsulation?
                 -------> the encapsulation is "DATA HIDING" Access modifieri private yapariz.

         Example 7) Abstract classlardan obje uretilir mi? neden?
             -----> Hayir, cunku abst classlarin icin de abstractor metodlar vardir onlar tamamlanmamistir,
             tamamlanmamis bir kaliptan obje uretilemez.
             Abstract  classlarda constructor vardir ama obje uretemez,
             o özelligini java kapatir

         Example 8) inheritance avantajlari nelerdir?
                ----> Maintenance(bakim) , Less code, reusability(tekrar kullanilabilme)

         Example 9) Why uses methods?
               -------> to reuse code: define the code once, and use it many time.


         Example 10) What is the difference between "Method Overloading" and "Method Overriding"?

            i)"Method Overriding" needs "inheritance" but "Method Overloading" occurs in a single class we do not need "inheritance"
            ii)"private" methods cannot be overridden but can be overloaded
            iii)We do not touch "method signature" in "Method Overriding" but we change "parameters" I mean method signature in "Method Overloading"
            iv)We cannot override "static" methods, we can "overload" them
            v) Other name of "Method Overloading" is "Static Polymorphism"
               Other name of "Method Overriding" is "Dynamic Polymorphism"
            vi)Other name of "Method Overloading" is "Compile Time Polymorphism"
               Other name of "Method Overriding" is "Run Time Polymorphism"


        */


    }
}




















