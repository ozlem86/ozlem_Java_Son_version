package day22overridingencapsulation;

public class RunnerClass {

    public static void main(String[] args) {

        Student myStd = new Student();

        String psycho = myStd.getPsychologicalIssues();
        System.out.println(psycho);// Depression

    }

}
