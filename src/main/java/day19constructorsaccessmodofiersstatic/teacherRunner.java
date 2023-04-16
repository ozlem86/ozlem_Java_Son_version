package day19constructorsaccessmodofiersstatic;

public class teacherRunner {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher();

        //teacherName variable is public that is why we can access it from en
        // entire the project(butun projeden)
        System.out.println(myTeacher.teacherName);//Tom Hanks


        //phone variable is protected that is why we can access it from  inside
        // the package.
        //  phone variable and myTeacher object are
        //  in "day19constructorsaccessmodofiersstatic" package
        System.out.println(myTeacher.phone);//14084321267

       // salary variable is default that is why we can access it from
        // inside the package. salary variable and myTeacher object are
        // in "day19constructorsaccessmodofiersstatic" package
        System.out.println(myTeacher.salary);

        //In teacher class there is one more variable which is idNumber,
        //but it is private that is why cannot access to it from the other class.

        // 1: if you are in a different package  default variables will be "inaccessible."
        // 2: if you are in a different package and the class you created the object is not the "child class"
        //    "protected" variables will be inaccessible.
        // 3: "private" things cannot be accessible from outside the class
        // 4: "public" ones will be accessible from entire the project.

    }
}
