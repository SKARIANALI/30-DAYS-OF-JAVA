//                                  // Multithreading problems //

// class Bus implements Runnable
// {  
//     int available=1,passenger;

//     Bus(int passenger)
//     {
//         this.passenger=passenger; // passe =1
//     }
//     public void run()     // t1 t2 t3
//     {

//         String name=Thread.currentThread().getName();

//          if(available>=passenger)
//          {
//             System.out.println(name+"Reserved seat....");
//             available=available-passenger;
//          }
//          else
//          {
//             System.out.println("No seats available");
//          }

//     }

// }

//     class customer
//     {
//         public static void main(String[] args) {

//             Bus ref=new Bus(1);

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

    
    
                                        // // Multithreading solutions //


// class Bus implements Runnable
// {  
//     int available=1,passenger;

//     Bus(int passenger)
//     {
//         this.passenger=passenger; // passe = 1
//     }
//     public synchronized void run()   // t1 or t2 or t3
//     {

//         String name=Thread.currentThread().getName();

//          if(available>=passenger)
//          {
//             System.out.println(name+"Reserved seat....");
//             available=available-passenger;  // 1-1 = 0
//          }
//          else
//          {
//             System.out.println("No seats available");
//          }

//     }

// }

//     class customer
//     {
//         public static void main(String[] args) {

//             Bus ref=new Bus(1);

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

                                        // passe=2 , avail=2 //

    

class Bus implements Runnable
{  
    int available=2,passenger;

    Bus(int passenger)
    {
        this.passenger=passenger; // passe = 2
    }
    public synchronized void run()   // t1 or t2 or t3
    {

        String name=Thread.currentThread().getName();

         if(available>=passenger)
         {
            System.out.println(name+"Reserved seat....");
            available=available-passenger;  // 2-2 = 0
         }
         else
         {
            System.out.println("No seats available");
         }

    }

}

    class customer
    {
        public static void main(String[] args) {

            Bus ref=new Bus(2);

            Thread t1=new Thread(ref);
            Thread t2=new Thread(ref);
            Thread t3=new Thread(ref);

            t1.setName("Arian");
            t2.setName("Arif");
            t3.setName("Akash");


            t1.start();
            t2.start();
            t3.start();
        }

    }
      
    

                                         // passe= 2 , avail =3 //

   
// class Bus implements Runnable
// {  
//     int available=3,passenger;

//     Bus(int passenger)
//     {
//         this.passenger=passenger; // passe = 2
//     }
//     public synchronized void run()   // t1 or t2 or t3
//     {

//         String name=Thread.currentThread().getName();

//          if(available>=passenger)
//          {
//             System.out.println(name+"Reserved seat....");
//             available=available-passenger;  // 3-2 = 1 // 1-2 = -1
//          }
//          else
//          {
//             System.out.println("No seats available");
//          }

//     }

// }

//     class customer
//     {
//         public static void main(String[] args) {

//             Bus ref=new Bus(2);

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







    
//                                          // passe= 1 , avail =3 //

   
// class Bus implements Runnable
// {  
//     int available=3,passenger;

//     Bus(int passenger)
//     {
//         this.passenger=passenger; // passe = 1
//     }
//     public synchronized void run()   // t1 or t2 or t3
//     {

//         String name=Thread.currentThread().getName();

//          if(available>=passenger)
//          {
//             System.out.println(name+"Reserved seat....");
//             available=available-passenger;  // 3-1 = 2 // 2-1 = 1
//          }
//          else
//          {
//             System.out.println("No seats available");
//          }

//     }

// }

//     class customer
//     {
//         public static void main(String[] args) {

//             Bus ref=new Bus(1);  // always use min no of passe // default =1 //

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