//                                            // synchronized Method //


// class Table
// {
//     public synchronized void printTable(int n)
//     {
//         for(int i=1; i<=10; i++)
//         {
//             System.out.println(n*i);
//         }
//     }

// }

// class thread1 extends Thread
// { 
//     Table t;

//     thread1(Table t)
//     {
//         this.t=t;
//     }
     
//     public void run()
//     {
//         t.printTable(2);
//     }

// }

// class thread2 extends Thread
// { 
//     Table t;

//     thread2(Table t)
//     {
//         this.t=t;
//     }
     
//     public void run()
//     {
//         t.printTable(5);
//     }

// }

// class syn{
//     public static void main(String[] args) {
//         Table obj = new Table();
//         thread1 t1 = new thread1(obj);
//         thread2 t2 = new thread2(obj);
//         t1.start();
//         t2.start();
//     }

// }




                                           // synchronized block //

class msg 
{
    public void show(String name)
    {
        ;;;;;; // LOC  // home

        synchronized(this)                             // bridge // at a time only 1 person can go //
        {
        for(int i=1; i<=3; i++)
        {
            System.out.println("How are you "+ name);
        }
        
       }
              ;;;;;; // LOC  // college
     }
}

class Mythread1 extends Thread
{
    msg m;
    String name;

    Mythread1(msg m,String name)
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}


class syn{
    public static void main(String[] args) {
        msg m = new msg();

        Mythread1 t1 = new Mythread1(m,"Arian");
        Mythread1 t2 = new Mythread1(m,"Arif");

        t1.start();
        t2.start();
    }

}                                           