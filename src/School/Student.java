package School;
/* This class is responsible for keeping the track of student fees,name, Trade & fee paid.*/
public class Student
{
    private int id;
    private  String name;
    private int grade;
    private int feesPaid,feesTotal,getRemaining;

    /**
     * @param id is for unique id.
     * Fees for every student is 30,000
     * @param name is for name of the student.
     * @param grade is for grade of the student
     */
    public Student(int id,String name,int grade)
    {
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid=0;
        this.feesTotal=30000;

    }
    //not going to Alter student name, student's id

    /**
     * use to update student grade.
     * @param grade new grade of student.
     */
    public void setGrade(int grade)
    {
        this.grade=grade;
    }

    /**
     * Keep adding the fees to feespaid feild, i.e feespaid=10000+20000.
     * add fees to fees paid
     * @param feesPaid
     */
    public void payfees(int feesPaid)
    {
        this.feesPaid=feesPaid;
        SchoolManagement.updateTotalMoneyEarned((feesPaid));
    }

    //return id of student
    public int getId()
    {
        return id;
    }

    //returns name
    public String getName()
    {
        return name;
    }

    // returns Grade
    public int getGrade()
    {
        return grade;
    }

    // returns feesPaid
    public int getfeesPaid()
    {
        return feesPaid;
    }

    // returns FeesTotal
    public int getFeesTotal()
    {
        return feesTotal;
    }
    // returns remaining fees
    public int getRemainingFee()
    {
        getRemaining=feesTotal-feesPaid;
        return getRemaining;
    }

    @Override
    public String toString() {
        return "Name : "+name+" Total fees paid so far $"+feesPaid;
    }
}
