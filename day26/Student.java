class Student
{  
    public static void main(String[] args) {
        Student ref=new Student("arian", 87, 85);
        Student.isEligible(ref);
    }
    String name;
    int roll;
    int attendance;

    Student(String name,int roll,int attendance)
    {
        this.name=name;
        this.roll=roll;
        this.attendance=attendance;
    }
    static void isEligible(Student ref)
    {
        if(ref.attendance>=75)
        {
            System.out.println(ref.name+" is eligible for admission");
        }
        else
        {
            System.out.println(ref.name+" is not eligible for admission");
        }
    }
   

}