package day18varargsstringbuilderstringbuffer;

public class stringBuilder02 {
    public static void main(String[] args) {
        //another way to create a StringBuilder
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java");
        sb1.append("xxxxxxxxxxxxx");
        int x = sb1.length();//4 gives you number of the character used in the string
        System.out.println(x);

        int x1= sb1.capacity();//34-->16*2+2 Stringbuilder her zaman karakterler icin 16 tane kutu acar.
        // 70-->34*2+2
        System.out.println(x1);

        //another way to create a StringBuilder
        StringBuilder sb2=new StringBuilder(2);// eger kisaltma yapilacaksa parantez icinde karakter sayisi
        // belirtilir.boylece stringbuilder bosuna 16 karakter icin kutu acmaz iki tane acar.
        sb2.append("Fl");

        int l =sb2.length();
        System.out.println(l);//2

        int c= sb2.capacity();
        System.out.println(c);//2 capasiteyi arttirma ayni mantikta olur.örnek 6--> 2*2+2

        //Create a string by using a StringBuffer Class
        StringBuffer sbf= new StringBuffer();
        sbf.append("wooow!");

        int l3 = sbf.length();
        System.out.println(l3);//6

        int c3= sbf.capacity();
        System.out.println(c3);//16

    }
}
