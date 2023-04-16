package day15arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists03 {
    public static void main(String[] args) {

        // Ask user to a letter if the letter exists in the list convert it to 'X'
        // otherwise add the element user entered into the list

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter = input.next().charAt(0);

        List<Character> myList= new ArrayList<>();
        myList.add('J');
        myList.add('A');
        myList.add('V');
        myList.add('A');

        if(myList.contains(letter)){
            myList.set(myList.indexOf(letter),'X');// sett methodu tekrar eden elementlerde first occurrence update ediyor

        }else{
            myList.add(letter);

        }
        System.out.println(myList);






    }
}
