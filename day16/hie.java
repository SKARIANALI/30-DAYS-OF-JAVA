 
                                  // Hierarchical Inheritance //  

// ONLY ONE SUPER CLASS AND MULTIPLE SUB CLASSES //
// SUB CLASSES EXTENDS TO SUPER CLASS //



class A 
{

    void input()
    {
        System.out.println("Enter your name : ");
    }


}                                       


class B extends A


{
   void show()
   {
    System.out.println("My name is Arian ");
   }



}






class C extends A

{

    void disp()
    {
        System.out.println("My  name is Ankush ");
    }


}


class hie extends A
{
     
    void ex()
    {
        System.out.println("yoyo");
    }
  public static void main(String[] args) {
      B r=new B();

      C ref= new C();

      hie ref2=new hie();
      
      r.input();
      r.show(); 

      ref.input();
      ref.disp();

      ref2.input();
      ref2.ex();

  }


}