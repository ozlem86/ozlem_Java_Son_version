package day11nestedforloopdowhileloop;

public class NestedForLoop01 {
    public static void main(String[] args) {

        //example 1) Type code to get output lik

        //                1
        //                1 2
        //                1 2 3
        //                1 2 3 4
        //                1 2 3 4 5

        int row = 5;


        for(int i =1; i<=row;i++){

            for(int k =1; k<=i; k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }

    }
}
