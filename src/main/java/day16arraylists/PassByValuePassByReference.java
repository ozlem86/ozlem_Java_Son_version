package day16arraylists;

public class PassByValuePassByReference {
    public static void main(String[] args) {

       int shirtPrice=100;
       studentShirtPrice(shirtPrice,10);
        System.out.println(shirtPrice);

        String r1= putExclamation("Ajda");
        System.out.println(r1);

        int n5= getAbsoluteValue(-5);
        System.out.println(n5);


    }

    public static void studentShirtPrice(int shirtPrice, int discount){
        int discountedPrice= shirtPrice-discount;
        System.out.println(discountedPrice);


        double newSlary= increaseSalary(20000);
        System.out.println(newSlary);
    }



    public static String putExclamation(String name){
        return name+ "!";
    }

      // Create a method increase the salary 20 percent

    public static double increaseSalary(double salary){
        return salary*1.2;// return means give the result to the user.
    }

    // create a method calculates the absolute value of integer

    public static int getAbsoluteValue(int n){
        if(n<0){
            return -1*n;
        }else{
            return n;
        }
    }

}
