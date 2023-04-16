package day17methodoverloadingdatetimeclasses;

public class MethodCreation {
    public static void main(String[] args) {

        // create a method adds two integers
        int r1= addTwoInt(3,5);
        System.out.println(r1);

        String r2= getFirstLastChar("Özlem");
        System.out.println(r2);

        int r3= getSumOfAsciisOfAllChar("özlem");
        System.out.println(r3);

    } //MAin



     //1) //Create a method add two integer

     public static int addTwoInt(int a,int b){
        return a+b;

     }
    //2) Create a method   prints the first and the last character on the console

    public static String getFirstLastChar (String s){

        return   "" + s.charAt(0) + s.charAt(s.length()-1);

        // " "+ kullandik cunku diger turlu char lari toplarsak ascii degerlerini toplar
        // stringle topladik ki concatination yapti

    }



    //3) Create a method the sum of the Ascii values of characters in a String

    public static int getSumOfAsciisOfAllChar(String s){
        int sumOfAsciis=0;

        for(int i=0; i<s.length();i++){
            sumOfAsciis =sumOfAsciis+ s.charAt(i);
        }
        return sumOfAsciis;
    }


}










