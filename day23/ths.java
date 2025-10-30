                                 // thread scheduler in java //
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

class ths {
    public static void main(String[] args) {
        A obj1 = new A();   // t1
        A obj2 = new A();   // t2
        A obj3 = new A();   // t3

        obj1.setName("Thread 1");
        obj2.setName("Thread 2");
        obj3.setName("Thread 3");

        obj1.start();
        obj2.start();
        obj3.start();

        String name = Thread.currentThread().getName();
        for(int i=1; i<=3; i++)
        {
           System.out.println(name);  // main thread default //
        }
    }

    
}
