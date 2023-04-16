package day16arraylists;

import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Example 1)  Convert an Array to a list

        String a[]=new String[5];

        a[0]="Tom";
        a[1]="Ajda";
        a[2]="Cuneyt";
        a[3]="Angelina";
        a[4]="Brad";

        System.out.println(Arrays.toString(a));

        List<String> myList= Arrays.asList(a);
        System.out.println(myList);
        // burasi artik list gibi oldu. Eger size i degistirecekse hicbir islem yapilamaz. add ve remove gibi..

    }
}
