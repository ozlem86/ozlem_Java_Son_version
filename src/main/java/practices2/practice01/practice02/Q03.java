package practices2.practice01.practice02;

public class Q03 {

        /*
    String shirtPrice= "$ 12.99";
    String bookPrice= "$ 35.99";
    Type code to find the sum of the shirt and book prices.
     */
        public static void main(String[] args) {

            String shirtPrice= "$ 12.99";
            String bookPrice= "$ 35.99";

            String shirt= shirtPrice.replace("$ ", "");//after replacement ==> "12.99"
            String book= bookPrice.replace("$ ", ""); //==> "35.99"

            double sd= Double.valueOf(shirt); //this will convert the data type of "shirt" object into double data type.

            double bd= Double.valueOf(book);

            System.out.println(sd+ bd);

        }



}
