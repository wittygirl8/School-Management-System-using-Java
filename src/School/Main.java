package School;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher mili=new Teacher(01001,"mili",700);
        Teacher rid=new Teacher(01002,"rid",20000);
        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(mili);
        teacherList.add(rid);

        Student akarsh=new Student(1,"akarsh",10);
        Student Adarsh=new Student(2,"Akarsh",20);
        List<Student> studentList=new ArrayList<>();
        studentList.add(Adarsh);
        studentList.add(akarsh);

        SchoolManagement Arya=new SchoolManagement(teacherList,studentList);
        akarsh.payfees(20000);
        System.out.println("Araya has earned:"+Arya.getTotalMoneyEarned());
        Adarsh.payfees(600000);
        System.out.println("Araya has earned:"+Arya.getTotalMoneyEarned());

        System.out.println("\n\n----------Money spent by School----------");
        mili.reciveSalary(mili.getSalary());
        System.out.println("Arya university spent on "+mili.getName()+" and now has $"+Arya.getTotalMoneyEarned());

        rid.reciveSalary(rid.getSalary());
        System.out.println("Araya spent on "+rid.getName()+" and now as "+Arya.getTotalMoneyEarned());

        //Student's details.
        System.out.println("\n\n------------Student's Details------------");
        System.out.println(Adarsh);
        System.out.println(akarsh);

        //Teacher's details.
        System.out.println("\n\n------------Teacher's Details------------");
        System.out.println(mili);
        System.out.println(rid);
    }
}
