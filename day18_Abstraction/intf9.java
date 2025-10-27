                                   // Interface JDK 1.9 //

// add private method it contains static and  default methods //
// private method written bcz implementing class reuse it //

// interface a
// {   
//     default void call()
//     {
//         add(10,20);
//     }
//     private void add(int x,int y)
//     {
//         System.out.println("sum is " +(x+y));
//     }
// }
// class b implements a
// { 
//     public void sub(int x,int y)
//     {
//         System.out.println("sub is " +(x-y));
//     }
// }
// class intf9{
//     public static void main(String[] args) {
//         b ref=new b();
//         ref.sub(20, 10);
//         // ref.add(10,20); // cannot access private method outside the interface 
//         // how can we access it  ?
//         // 1. Through default method //

//           ref.call(); // addition 
//     }

// }



// 2. Through static method //


interface a
{   
    static void call()
    {
        add(10,20);
    }
    private static void add(int x,int y) // it must be static 
    {
        System.out.println("sum is " +(x+y));
    }
}
class b implements a
{ 
    public void sub(int x,int y)
    {
        System.out.println("sub is " +(x-y));
    }
}
class intf9{
    public static void main(String[] args) {
        b ref=new b();
        ref.sub(20, 10);

         a.call(); // addition call through interface name 
    }

}
