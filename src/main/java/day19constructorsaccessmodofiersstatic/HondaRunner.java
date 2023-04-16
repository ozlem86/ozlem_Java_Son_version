package day19constructorsaccessmodofiersstatic;

public class HondaRunner {
    public static void main(String[] args) {

        Honda h1 = new Honda(); //Honda is constructor,object olusturdum

        System.out.println(h1.numOfCarsProduced);//1

        System.out.println(h1.price);//22000


        Honda h2 = new Honda();

        System.out.println(h2.numOfCarsProduced);//2

        System.out.println(h2.price);//22000
        

    }
}
