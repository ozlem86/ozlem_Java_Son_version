package day18varargsstringbuilderstringbuffer;

public class varargs01 {
    public static void main(String[] args) {


        //Create a method to add any number of integers( sadece iki sayiyla islem degil kac tane sayi olursa olsun)
        // varargs larla kullanilmasi gerekiyor.

        //* Note: can i use parameter before varargs in a method? yes, using parameters before
        //add(boolean b, int...a) her zaman son parameter varargslarin olmasi lazim diger turlu eror verir.
        //Varargs is a data structure uses "arrays" behind that is why when you use "varargs" you may
        //think you are using Arrays

        int r= add(3,50,5,8);
        System.out.println(r);

    } //main

       public static int add(int... v) {

           int sum = 0;
           for (int w : v) {
               sum = sum + w;

           }
           return sum;


       }



}
