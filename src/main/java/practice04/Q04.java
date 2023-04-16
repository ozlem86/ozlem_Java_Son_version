package practice04;

public class Q04 {
    public static void main(String[] args) {
        // Type code to find the sum of the digits of an integer
        //  584 ==> 5+8+4= 17  ==> %10 AND ORDINARY DIVISION BY 10

        int sumOfDigits=0;

        int number= 1234;

        number= Math.abs(number); //Math.abs() will convert a negative number to its positive value ==> -666 => 666
        //if we have positive value it will return the number itself

        for (int i=number; i>0; i=i/10 ){

            sumOfDigits =  sumOfDigits+ i%10;

        }
        System.out.println(sumOfDigits);


    }
}
