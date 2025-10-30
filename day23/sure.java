                                   // Suspend and resume //

class A extends Thread
{
    public void run()
    {   
        String name = Thread.currentThread().getName();
        for(int i=1; i<=3; i++)
        {
           System.out.println(name);
        }
    }


}



class sure {
    public static void main(String[] args) throws InterruptedException
    {
        A obj1 = new A();   // t1
        A obj2 = new A();   // t2
        A obj3 = new A();   // t3

        obj1.setName("Thread 1");
        obj2.setName("Thread 2");
        obj3.setName("Thread 3");

        obj1.start();

        obj2.start();
        obj2.suspend();  // pause //


        obj3.start();
 
        obj2.resume();  // restart //




    }

    
}

// Here suspend and resume not applicable bcz this methods are removed from JDK --v 1.2 //


// output :

// Thread 1
// Thread 3

// Thread 2
// Thread 1
// Thread 3

// Thread 3
// Thread 1
// Thread 2




























