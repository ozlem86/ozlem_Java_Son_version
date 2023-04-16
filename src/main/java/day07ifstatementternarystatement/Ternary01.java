package day07ifstatementternarystatement;

public class Ternary01 {
    public static void main(String[] args) {
         //Example 1) Type code to check if a number is even or not by using ternary.
        // if lerle ayni isi yapar iflerden daha sade bir syntexti var.

        int num=8;

        String result = num%2==0 ? "Even" : "Odd";
        System.out.println(result);

        // num%2==0 (eger  burasi dogruysa ? den sonraki eger degilse: den sonrasi)

        //Example 2) Type code to check if a number has 3 digits or not

        int n = 143;

        String r1= n>99 && n<1000 ? "it has 3 digits" : "it has not 3 digits";
        System.out.println(r1);


    }
}
