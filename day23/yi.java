                                      // yield() method in java //

class A extends Thread
{
    public void run()
    {   
        String name = Thread.currentThread().getName();
        for(int i=1; i<=3; i++)
        {
           System.out.println(name);
           Thread.yield();
        }
    }

}
class B extends Thread
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

class yi{
    public static void main(String[] args) {
        A obj1 = new A();   // t1
        B obj2 = new B();   // t2

        obj1.setName("Thread 1");
        obj2.setName("Thread 2");

        obj1.start();
        obj2.start();

    }

}