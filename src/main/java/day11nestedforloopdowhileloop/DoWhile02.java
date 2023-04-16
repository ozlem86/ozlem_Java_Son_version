package day11nestedforloopdowhileloop;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {

        //Example 1) Username is "admin" Password is "pwd123"
        //Ask user to enter username and password
        // If he enters correct credentials he should get " you are in account"
        // otherwise, should see "enter your name and pasw" 3 times
        // after 3 times should get " your account is blocked"

        Scanner input= new Scanner(System.in);
        int cnt =0;
        do{

            if(cnt==3) {
                System.out.println("your account is blocked");
                break;

            }

            System.out.println("Enter your username");
            String userName=input.next();
            System.out.println("Enter your password");
            String psw= input.next();

            if(userName.equals("admin") && psw.equals("pwd123")){
                    System.out.println( "you are in account");
                    break;
            }
                cnt++;

            }while(true);


    }
}
