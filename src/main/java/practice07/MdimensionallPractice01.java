package practice07;

import java.util.Arrays;

public class MdimensionallPractice01 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in the array or not

        char ch[] = new char[5];
        ch[0] = 'A';
        ch[1] = 'Y';
        ch[2] = 'C';
        ch[3] = 'I';
        ch[4] = 'D';
        System.out.println(Arrays.toString(ch)); //[A, Y, C, I, D]

        //1.way:
        int flag=0;

        for (char w: ch){

            if (w=='X'){

                flag++;
                break;

            }
        }
        if (flag>0){
            System.out.println("The element exists");
        }else {
            System.out.println("The element does not exist in the array");
        }

        //2.way:Use binarySearch() tells you if the element exists or not in the array.
        //     Before using binarySearch() we have to use sort() first.

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        int idx1= Arrays.binarySearch(ch, 'Y'); //[A, C, D, I, Y]
        System.out.println(idx1);//4

        int idxX= Arrays.binarySearch(ch, 'X');

        System.out.println(idxX);//-5//  [A, C, D, I, Y]

        int idxE= Arrays.binarySearch(ch, 'E');
        System.out.println(idxE);//-4


     // ---------------------------------------------

        //how to create multidimensional array

        int arr[][]= new int[4][2];

        System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0], [0, 0]]

        //How to add elements into a multidimensional array

        arr[0][0]=3;
        arr[0][1]=10;

        arr[1][0]=61;
        arr[1][1]=5;

        arr[2][0]= 2;
        arr[2][1]=11;

        arr[3][0]=81;
        arr[3][1]=23;
        System.out.println(Arrays.deepToString(arr)); //[[3, 10], [61, 5], [2, 11], [81, 23]]

        //how to print the element from outer array.

        System.out.println(Arrays.toString(arr[1]));//[61, 5]
        System.out.println(Arrays.toString(arr[2]));//

        //how to print the elements one by one
        System.out.println(arr[2][1]);//11

    }


}
