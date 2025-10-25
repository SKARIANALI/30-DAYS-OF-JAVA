//                                  // Simple Inheritance //


//  // Only one super class and sub class //

//  // (private) var , private method not accessable but (protected)  accessable 

//  class Simple{        //Super class
//     int roll;
//     int marks;
//     String name ;

//     void input()
//         {
//                System.out.println("Enter roll,marks  and name : ");
//         }
    


//  }

//  class sub extends Simple{        // Sub class 


//     void disp()
//     {
//          roll=10;
//          marks =90;
//          name="Arian";
//          System.out.println(roll+" "+marks+" "+name);
//     }

//     public static void main(String[] args) {
//         sub ref=new sub();                                 // obj creation must be under sub class 
//         ref.input();
//         ref.disp();
        
//     }
    
//  }






//   class Simple{        //Super class
   
//    private  int roll;  // not accessable 
//     int marks;
//     String name ;

//     private void input()  //  not accessable 
//         {
//                System.out.println("Enter roll,marks  and name : ");
//         }
    


//  }

//  class sub extends Simple{        // Sub class 


//     void disp()
//     {
//          roll=10;
//          marks =90;
//          name="Arian";
//          System.out.println(roll+" "+marks+" "+name);
//     }

//     public static void main(String[] args) {
//         sub ref=new sub();                                 // obj creation must be under sub class 
//         ref.input();
//         ref.disp();
        
//     }
    
//  }








 class Simple{        // Super class
   
   protected   int roll;  //  accessable 
    int marks;
    String name ;

    protected  void input()  //   accessable 
        {
               System.out.println("Enter roll,marks  and name : ");
        }
    


 }

 class sub extends Simple{        // Sub class 


    void disp()
    {
         roll=10;
         marks =90;
         name="Arian";
         System.out.println(roll+" "+marks+" "+name);
    }

    public static void main(String[] args) {
        sub ref=new sub();                                 // obj creation must be under sub class 
        ref.input();
        ref.disp();
        
    }
    
 }