package day19constructorsaccessmodofiersstatic;

public class Students {
    /*
    1) we need constructor to create an object from a class.
    ") when we create a class java puts a constructor in it, because java knows classes are for creating object
    3)when we create a class you will not see any constructor in it, but the class has constructor,
    it is invisible constructor.
    4)Invisible constructors are called "default constructors".
    5) to create a constructor fallow the steps;
    a:use access modifier mostly we use "public"
    b: use class name as constructor
    c: Open close constructor parenthesis
    d:Open close curly braces.
    6)When you create constructor manually Java will delete the "default constructor".
    7)We can create many constructor in a class
       a:constructors names will be same, bec. every constructors uses class name as name
       b: every constructor must have different parameters
    8)What are the differences between method and the constructor?  (interviews questions)
      a:Methods have return type but constructors dont have
      b:Methods are for some actions, but constructors are for object creation.

     */

    public String stdName;
    public int age;
    public boolean success;
    public String gender;

    public Students(){

    }

    //Create a constructor uses variables
    public Students(String stdName, int age, boolean success, String gender){

        this.stdName= stdName;        // this---> mean this class yani students classtaki stdNAme´e bunu koy.
        this.age=age;
        this.gender=gender;
        this.success=success;
    }

    //Create a constructor uses some of the variables

    public Students (String stdName, int age, boolean success){

        this.stdName= stdName;
        this.age=age;
        this.success=success;

        // contructorlarda kullanilan parameterler farkli.

    }

    //create a constructor by using intellij


    public Students(String stdName, int age) {
        this.stdName = stdName;
        this.age = age;

    }
}



























