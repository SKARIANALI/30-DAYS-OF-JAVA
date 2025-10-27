                                    // Interface //

import java.util.Scanner;

interface client 
{
    void input();   // by default public + abstract 
    void output();

} 

class arian implements client  // here implements is a modifier 
{   
    String name ;
    double sal;
    public void input()
    {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter your name :");
        name=r.next();
        System.out.println("Enter your salary :");
        sal=r.nextDouble();
    }
    public void output()
    {
        System.out.println(name+" "+sal);
    }
}

class inter
{
    public static void main(String[] args) {
        arian ref=new arian();
        ref.input();
        ref.output();
    
    }
}