//                                         // Multithreading problem //

// class bank extends Thread

// {  
//     int bal=5000,withdraw;

//     bank(int withdraw)
//     {
//         this.withdraw=withdraw;
//     }
//     public void run()     // t1 t2 t3
//     {

//         String name=Thread.currentThread().getName();

//          if(withdraw<=bal)
//          {
//             System.out.println(name+" money withdrawed....");
//             bal=bal-withdraw;
//          }
//          else
//          {
//             System.out.println("No money available");
//          }

//     }

// }

//     class cust
//     {
//         public static void main(String[] args) {

//             bank ref=new bank(5000);

//             Thread t1=new Thread(ref);
//             Thread t2=new Thread(ref);
//             Thread t3=new Thread(ref);

//             t1.setName("Arian");
//             t2.setName("Arif");
//             t3.setName("Akash");


//             t1.start();
//             t2.start();
//             t3.start();
//         }

//     }




//                                         // Multithreading solution //

// class bank extends Thread

// {  
//     int bal=5000,withdraw;

//     bank(int withdraw)
//     {
//         this.withdraw=withdraw;  // withdraw=5000
//     }
//     public synchronized void run()     // t1 or t2 or t3
//     {

//         String name=Thread.currentThread().getName();

//          if(withdraw<=bal)
//          {
//             System.out.println(name+" money withdrawed....");
//             bal=bal-withdraw; // 5000 - 5000 =0
//          }
//          else
//          {
//             System.out.println("No money available");
//          }

//     }

// }

//     class cust
//     {
//         public static void main(String[] args) {

//             bank ref=new bank(5000);

//             Thread t1=new Thread(ref);
//             Thread t2=new Thread(ref);
//             Thread t3=new Thread(ref);

//             t1.setName("Arian");
//             t2.setName("Arif");
//             t3.setName("Akash");


//             t1.start();
//             t2.start();
//             t3.start();
//         }

//     }





//                                 // Synchro problem  //  greater than one obj creation //

// class bank extends Thread

// {  
//     int bal=5000,withdraw;

//     bank(int withdraw)
//     {
//         this.withdraw=withdraw;  
//     }
//     public synchronized void run()     
//     {

//         String name=Thread.currentThread().getName();

//          if(withdraw<=bal)
//          {
//             System.out.println(name+" money withdrawed....");
//             bal=bal-withdraw; 
//          }
//          else
//          {
//             System.out.println("No money available");
//          }

//     }

// }

//     class cust
//     {
//         public static void main(String[] args) {

//             bank ref=new bank(5000); // 1st obj creation // obj 1 has one lock //

//             Thread t1=new Thread(ref);
//             Thread t2=new Thread(ref);
//             Thread t3=new Thread(ref);

//             t1.setName("Arian");
//             t2.setName("Arif");
//             t3.setName("Akash");

//             bank ref2=new bank(5000);  // 2nd obj creation // obj 2 has one lock //

//             Thread t4=new Thread(ref2);
//             Thread t5=new Thread(ref2);
//             Thread t6=new Thread(ref2);

//             t4.setName("Arian 2");
//             t5.setName("Arif 2");
//             t6.setName("Akash 2");

//             t1.start();
//             t2.start();
//             t3.start();
//             t4.start();
//             t5.start();
//             t6.start();
        
//         }

//     }



    
                                // Synchro solution   //  static  //

class bank extends Thread

{  
    static int bal=5000,withdraw; // var static 

    bank(int withdraw)
    {
        this.withdraw=withdraw;  
    }
    public static synchronized void Withdraw()     // static method cannot override that's why we can change run() //
    {

        String name=Thread.currentThread().getName();

         if(withdraw<=bal)
         {
            System.out.println(name+" money withdrawed....");
            bal=bal-withdraw; 
         }
         else
         {
            System.out.println("No money available");
         }

    }
    public void run() 
    {
        Withdraw();
    }


}

    class cust  // bank has one lock // 
    {
        public static void main(String[] args) {

            bank ref=new bank(5000); 

            Thread t1=new Thread(ref);
            Thread t2=new Thread(ref);
            Thread t3=new Thread(ref);

            t1.setName("Arian");
            t2.setName("Arif");
            t3.setName("Akash");

            bank ref2=new bank(5000); 

            Thread t4=new Thread(ref2);
            Thread t5=new Thread(ref2);
            Thread t6=new Thread(ref2);

            t4.setName("Arian 2");
            t5.setName("Arif 2");
            t6.setName("Akash 2");

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();
        
        }

    }