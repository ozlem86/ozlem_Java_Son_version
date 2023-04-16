package day17methodoverloadingdatetimeclasses;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        int r4= multiply(3,5);
        System.out.println(r4);

    }



    //1)

    public static int multiply (int a, int b){

        return a*b;
    }

    //2)

    public static double multiply (double a, int b){

        return a*b;
    }
    //3)

    public static int multiply (int a, int b, int c) {

        return a * b * c;

    }
}

//if you create methods with 1:the same name and 2: different parameters, it means you created
//"method overloading"
//Java checks just the "method name" and "parameters" to understand if the methods are same or not.
//"method name" and "parameters" are called "method signature"
//parameterslerin yerini degistirebilirsin int ve double nin yerini degistirebilirsin
//boylece java farkli kabul eder.
//access modifier lerin  metodh overloadinlerde herhangi bir rolu yok.











