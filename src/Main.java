import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager jane = new Manager("Jane", 51);
        Manager tom = new Manager("Tom", 38);
        Recruiter harry = new Recruiter("Harry", jane, 179);
        Recruiter nancy = new Recruiter("Nancy", tom, 168);
        Recruiter ann = new Recruiter("Ann", tom, 471);
        JobSeeker john = new JobSeeker("LMN", "John", harry);
        JobSeeker susan = new JobSeeker("LMN", "Susan", nancy);
        JobSeeker david = new JobSeeker("BFD", "David", ann);
        JobSeeker sarah = new JobSeeker("C93", "Sarah", harry);
        JobSeeker daniel = new JobSeeker("K14", "Daniel", ann);

        jane.addEmployee(harry);

        ArrayList<Employee> tomsEmployees = new ArrayList<>();
        tomsEmployees.add(nancy);
        tomsEmployees.add(ann);
        tom.setEmployees(tomsEmployees);

        harry.addJobSeeker(john);
        harry.addJobSeeker(sarah);
        nancy.addJobSeeker(susan);
        ann.addJobSeeker(david);
        ann.addJobSeeker(daniel);


        System.out.println(jane.toString());
        System.out.println(tom.toString());
        System.out.println();
        System.out.println(harry.toString());
        System.out.println(nancy.toString());
        System.out.println(ann.toString());
        System.out.println();
        System.out.println(john.toString());
        System.out.println(sarah.toString());
        System.out.println(susan.toString());
        System.out.println(david.toString());
        System.out.println(daniel.toString());
        /*
        Recruiter Harry  179
        Recruiter Nancy  168
        Recruiter Ann    471
        JobSeeker John   T3Q
        JobSeeker Susan  LMN
        JobSeeker David  BFD
        JobSeeker Sarah  C93
        JobSeeker Daniel K14
         */
    }
}
