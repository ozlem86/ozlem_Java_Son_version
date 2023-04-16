package practice06;

import java.util.Arrays;

public class ArraysPractice01 {
    public static void main(String[] args) {


        //Example 1: Create an integer array, add 6 elements in it. Find the sum of all elements.

        int[] ages = new int[6];

        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0, 0]

        ages[0] = 13;
        ages[1] = 24;
        ages[2] = 12;
        ages[3] = 19;
        ages[4] = 34;
        ages[5] = 21;

        System.out.println(Arrays.toString(ages));//[13, 24, 12, 19, 34, 21]

        int sum = 0;

        for (int w : ages) {

            sum = sum + w;

        }
        System.out.println(sum);//123

        //Example 2: Create an integer array type code to find the sum of the min and max value
        //[12, 45, 9, 56] ==> 9+56= 65
        // sort() --> 9, 12, 45, 56


        int[] nums = new int[4];
        nums[0] = 12;
        nums[1] = 45;
        nums[2] = 9;
        nums[3] = 56;

        System.out.println(Arrays.toString(nums));//[12, 45, 9, 56]
        //sort() puts elements in ascending order automatically

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));//[9, 12, 45, 56]

        int sumOfMinMax = nums[0] + nums[nums.length - 1];

        System.out.println(sumOfMinMax);//65


    }
}
