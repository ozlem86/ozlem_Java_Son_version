package day09forloops;

public class ForLoop02 {
    public static void main(String[] args) {

        // Put * between 2 consecutive characters and to the end in a String.

        String ab = "Java";

        for(int i= 0;i<ab.length();i++){

            System.out.print(ab.charAt(i)+"* ");

        }

        System.out.println();
        //Example 2 ) // Example 1: Type code to print unique characters in a String(Interview Question)

                String t= "Hello";

                for(int i =0;i<t.length();i++){
                    char ch= t.charAt(i);// t stringinden i indexindeki characteri al

                    if(t.indexOf(ch)==t.lastIndexOf(ch)){
                        System.out.print(ch);//Heo
                    }
                }


        System.out.println();

        // Example 3) Type code to print a String in reverse after removing space

        String a ="Ali Can";
                 for(int i=a.length()-1; i>=0;i--){
                     char ch =a.charAt(i);
                     System.out.print(ch);//naC ilA
                 }
        System.out.println();

        //Example 4) Type code to find the sum of the integers from 3 to 7


        int sum=0;
        for(int i=3; i<8 ; i++){

            sum=sum+i;

        }
        System.out.println(sum);//25

    }
}
