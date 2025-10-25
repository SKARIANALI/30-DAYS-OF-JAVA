                                            // Multilevel Inheritance //

// only one super class but multilevel sub classes 


//  super class
//         |
//       sub 1    // sub 1 extends super class 
//         |
//       sub 2    // sub 2 extends sub 1





// class A                 // Super class 
// {
//     int a,b,c;

//     void add()
//     {
//         a=10;
//         b=20;
//         c=a+b;
//         System.out.println("Add of two numbers : "+c);
//     }

//     void sub()
//     {
//         a=30;
//         b=10;
//         c=a-b;
//         System.out.println("sub of two numbers :" +c);
//     }
// }



// class B extends A       // sub class 1
// {
//     void mul()
//     {
//         a=10;
//         b=20;
//         c=a*b;
//         System.out.println("mul of two numbers : "+c);
//     }
//     void div()
//     {
//         a=10;
//         b=10;
//         c=a/b;
//         System.out.println("div of two numbers : "+c);
//     }

// }

// class mullvl extends B        // sub class 2
// {

//      void rem()
//         {
//            a=20;
//            b=10;

//            int rem=a%b;

//            System.out.println("rem of two numbers : "+rem);
//          }
        





//     public static void main(String[] args) {

//         mullvl ref= new mullvl();             // obj creation 

//         System.out.println("Final results :");

//         ref.add();
//         ref.sub();
//         ref.mul();
//         ref.div();
//         ref.rem();

//     }
// }


























import java.util.Scanner;
class A                     // Super class 
{
    int a,b;
    Scanner r=new Scanner(System.in);

    void add()
    {
       a=r.nextInt();
       b=r.nextInt();
       System.out.println("Add  : " +(a+b));
    }

    void sub()
    {
        //  a=r.nextInt();                         // if  we put another number to find sub then write this line otherwise no 
        //  b=r.nextInt();
        System.out.println("sub  :" +(a-b) );
    }
}



class B extends A       // sub class 1
{
    void mul()
    {
        //  a=r.nextInt();
        //  b=r.nextInt();
        System.out.println("mul  : "+(a*b));
    }
    void div()
    {
        //  a=r.nextInt();
        //  b=r.nextInt();  
        System.out.println("div  : "+(a/b));
    }

}

class mullvl extends B        // sub class 2
{

     void rem()
        {
            //  a=r.nextInt();
            //  b=r.nextInt();

           

           System.out.println("rem  : "+(a%b));
         }
        





    public static void main(String[] args) { 

         mullvl ref= new mullvl();                                 // obj creation for sub class 

        // System.out.println("Enter two numbers for add : ");      // separated value for add , sub, div, mul, rem
        // ref.add();
        // System.out.println("Enter two numbers for sub : ");
        // ref.sub();
        // System.out.println("Enter two numbers for mul : ");
        // ref.mul();
        // System.out.println("Enter two numbers for div : ");
        // ref.div();
        // System.out.println("Enter two numbers for rem : ");
        // ref.rem();


        System.out.println("Enter two numbers : ");      // only enter two number and find all 
        ref.add();
        ref.sub();
        ref.mul();
        ref.div();
        ref.rem();

    }
}