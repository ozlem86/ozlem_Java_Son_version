package practice07;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        //Type a code to print its season after getting a month from the user

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month name");

        String month = input.next().toLowerCase();

        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("Spring");
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            System.out.println("Summer");
        } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
            System.out.println("Autumn");
        } else if (month.equals("december") || month.equals("january") || month.equals("february")) {
            System.out.println("Winter");
        } else {
            System.out.println("Please enter a valid month name...");
        }


        //Type code to print the integers divisible by 4 and by 6 from 13 to 211.

        //1.way:
        for (int i = 13; i < 212; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180 192 204
            }

        }

        System.out.println();
        //2.way:

        int i = 13;

        while (i < 212) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180 192 204
            }
            i++;

        }
    }
}
