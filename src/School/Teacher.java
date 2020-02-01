package School;
/**
 * This class is responsible for keeping the track of teacher's name, id, salary.
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a constructor which initialises
     * @param id uniqe id for the teacher
     * @param name name of techer
     * @param salary monthly salary of a teacher
     */
    public Teacher(int id,String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        salaryEarned=0;
    }

    //returns id
    public int getId()
    {
         return id;
    }

    //returns name
    public String getName()
    {
        return name;
    }
    //returns salary

    public int getSalary()
    {
        return salary;
    }

    /**
     * we are setsting the salary.
     * @param Salary monthaly salary of a student.
     */
    public void setSalary(int Salary)
    {
        this.salary=salary;
    }

    /**
     * adds to recive salary.
     * substract from total money earned by the school.
     * @param salary recived v=by teacher
     */
    public void reciveSalary(int salary)
    {
        salaryEarned+=salary;
        SchoolManagement.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name : "+name+" Salary : "+salary;
    }
}
