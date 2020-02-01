package School;/*Class "School Management System", "Students, Teachers and funds."
*  //Money management system for School.
*
* Keep track of student total fees.
* fees already paid.
* teachers salary.*/

/*
* School
* Teachers
* Student
* Total money earned
* Total money spent on teachers
 */

/*Teacher
* id,
* name,
* salary*/

/*Student
* id,
* name,
* grade,
* fees paid,
* fees total*/

import java.util.List;

//OOP
public class SchoolManagement
{
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * creating a constructor to initialize the school management system
     * @param teacher reprasenting list of teachers.
     * @param student reprasenting list of students.
     */
    public SchoolManagement(List<Teacher> teachers, List<Student> students)
    {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return  returns the list of teachers of school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the schoo;.
     * @param teacher which is going to add.
     */
    public void addTeacher(Teacher teacher) {
       teachers.add(teacher);
    }
    /**
     *
     * @return the list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * it is use to add students
     * @param student is going to be add in the school.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money by the school
     * @param MoneyEarned that suppose to be added
     */
    public static void  updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the students
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * money that is spent by the school.
     * the money that is given out to the teachers.
     * @param MoneySpent by the school.
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
