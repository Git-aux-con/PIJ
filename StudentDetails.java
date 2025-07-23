// class to represent a Student
class Student{
    // Declaring private variables 
    private String stdId, stdName;
    private int age;
//----------------------------------------------------------------------
    // getter methods
    public String getStdId()
    {
        return stdId;
    }
    public String getStdName()
    {
    return stdName;
    }
    public int getAge()
    {
        return age;
    }
//------------------------------------------------------------------------------
    // setter methods
    public void setStdId(String stdId)
    {
    this.stdId = stdId;
    }
    public void setStdName(String stdName)
    {
    this.stdName = stdName;
    }
    public void setAge(int age)
    {
    this.age = age;
    }   
}
//------------------------------------------------------------------------
public class StudentDetails{
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setAge(14);
        std1.setStdId("A-101");
        std1.setStdName("Manoj");
        System.out.println("Student Name : "+ std1.getStdName());
        System.out.println("Student ID : "+ std1.getStdId());
        System.out.println("Student Age : "+ std1.getAge());
        //--------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------");
        Student std2 = new Student();
        std2.setAge(17);
        std2.setStdId("A-102");
        std2.setStdName("Rohan");
        System.out.println("Student Name : "+ std2.getStdName());
        System.out.println("Student ID : "+ std2.getStdId());
        System.out.println("Student Age : "+ std2.getAge());

    }
    
}