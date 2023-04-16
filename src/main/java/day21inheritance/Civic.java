package day21inheritance;

public class Civic extends Honda{

    public void ecoSystem(){             //method
        System.out.println("Civic is not expensive");

    }

    public Civic() {              // constructor
        super(2022); //parentlere cikar
        System.out.println("civic constructor");
    }

    public Civic (boolean hybird){
        this();// constructor

        System.out.println("Civic contructor with boolean parameter");


    }
}
