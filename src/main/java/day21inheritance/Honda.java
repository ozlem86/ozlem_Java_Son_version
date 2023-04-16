package day21inheritance;

public class Honda extends Vehicle {

    public void engine(){         //method
        System.out.println("Honda uses engine");
    }
    public void brake (){          //method
        System.out.println("Honda stops securely ");
    }

    public Honda() {         //constructor
        super();
        System.out.println("honda constructor");
    }

    public Honda(int year){     //constructor
        super("OZL");
        System.out.println( "honda constructor with int parameter");

    }


}
