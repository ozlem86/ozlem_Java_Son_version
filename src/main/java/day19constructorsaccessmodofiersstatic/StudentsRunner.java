package day19constructorsaccessmodofiersstatic;

public class StudentsRunner {
    public static void main(String[] args) {

        Students std1 = new Students("Tom",13,true,"male");     //object olusturdum
        Students std2 = new Students("Ali",21, false);
        Students std3 = new Students();

        System.out.println(std1.stdName);//tom
        System.out.println(std2.gender);//null (default value, cunku eklemedik)
        System.out.println(std3.age);//0   cunku bos, Java Default value atar.
        System.out.println(std2.age);// 21




    }
}
