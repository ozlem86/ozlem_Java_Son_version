package day20inheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.eat();
        myCat.drink();
        myCat.meow();
                                // Animals eat
                                //animals drink
                                //Cat meow...  diger classlardan cagirdik!

         Dog myDog= new Dog();

         myDog.bark();
         myDog.drink();
         myDog.eat();             //Dogs bark...
                                 //animals drink
                                 //Animals eat


         Bird myBird = new Bird();

         myBird.tweet();
         myBird.drink();
         myBird.eat();          //Birds tweet...
                                //animals drink
                               //Animals eat

        /*
        Child classes can uses methods or variables from parent classes but
        parents(super) classes cannot use methods or variables from child(sub) classes.
        For public and protected access modifiers there is no issue in inheritance.
        For default access modifier if the object and the parents class are in the same package
        inheritance is possible but if the object and the parents are in the difference package
        inheritance impossible.
        For private access modifier inheritance is impossible.
        Java doesnot accept multiple parents for a class.Java does not support multiple inheritance,
        Java support single inheritance
         */

    }



}
