package interviewquestions;


import java.util.*;

public class SoruCözum {


    //Soru: sadece pespese tekrar eden sayilari yazdirin.örn:3 sayisi list te iki tane ama onu almiyoruz
    // 4,7,ve 9 olmali
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 4, 4, 5, 150, 150, 6, 7, 7, 8, 3, 9, 9, 5, 33, 33));
        List<Integer> list2 = new ArrayList<>();


        for (int i = 1; i < list.size(); i++) {
            Collections.sort(list);


            if (list.get(i - 1) != list.get(i)) {
                list2.add(list.get(i - 1));

            }

        }
        System.out.println(list2);


        /* --   ***     ***           5 6 7 || 13 14 15
         *     * *      *        3 9 11|| 18
         *                 *      1||19
         *              *
         *          *
         *    *
         *

         */

        for (int row = 1; row < 8; row++) {
            for (int column = 1; column < 20; column++) {
                if (row == 1 && (column == 5 || column == 6 || column == 7 || column == 13 || column == 14 || column == 15) ||
                        row == 2 && (column == 3 || column == 9 || column == 11 || column == 18) ||
                        row == 3 && (column == 1 || column == 19) ||
                        row == 4 && (column == 3 || column == 18) ||
                        row == 5 && (column == 5 || column == 16) ||
                        row == 6 && (column == 7 || column == 12) ||
                        row == 7 && (column == 9)
                ) {
                    System.out.print("*");

                } else
                    System.out.print(" ");

            }
            System.out.println();

        }


      /*
        1 2 3 4 5 6
         2 3 4 5 6
          3 4 5 6
           4 5 6
            5 6
             6


       */

        for (int satir = 1; satir < 7; satir++) {
            for (int bosluk = 1; bosluk < satir; bosluk++) {
                System.out.print(" ");

            }
            for (int sayi = satir; sayi < 7; sayi++) {
                System.out.print(sayi + " ");


            }
            System.out.println();

        }

        String isim = "Özlem";
        String tverse = "";

        for (int i = isim.length() - 1; i >= 0; i--) {
            char harf = isim.charAt(i);
            tverse += harf;

        }
        System.out.println();


        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(i);

            for (int j = 0; j < i; j++) {
                System.out.println(" **");

            }
            for (int k = 0; k < 3; k++) {
                System.out.println("benim oglum");

            }
            String nName = "";
            String name = "ALi yazar";
            for (int a = name.length() - 1; a >= 0; a--) {
                char reverse = name.charAt(a);
                nName += reverse;

            }
            System.out.println(nName);

            int num = -584;
            num = Math.abs(num);
            int sum = 0;

            for (int m = num; m > 0; m = m / 10) {
                sum += m % 10;


            }
            System.out.println(sum);

        }


        double deger = 12.55555;
        System.out.printf("%.2f", deger);

        int a = 1234;
        int sonRakam = a % 10;
        System.out.println(sonRakam);

        int ilkRakam = a;
        for (int i = ilkRakam; ilkRakam > 9; ilkRakam /= 10) {


        }
        System.out.println(ilkRakam);
        System.out.println("" + (sonRakam + ilkRakam));

        System.out.println((int) (Math.random()*101 ) );


        System.out.println();




        }




            }

        




































