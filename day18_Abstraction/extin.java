//                                        // extending interfaces //

// interface A 
// {
//     void show();
// }

// interface B extends A
// {

//     void disp();

// }

// class extin implements B 
// {   
//     @Override
//     public void show() // method must be public 
//     {
//         System.out.println("implements class A  ");
//     } 
//     @Override 
//     public void disp() // method must be public 
//     {
//         System.out.println("implements class B ");
//     }   
//     public static void main(String[] args) {
//         extin ref = new extin();
//         ref.show();
//         ref.disp();
//     }

// } 










interface A 
{
    void add();
}

interface B extends A
{

    void sub();

}

class extin implements B 
{   
    @Override
    public void add() // method must be public 
    {    
        int a=10,b=20;
        System.out.println("implements class A add is " + (a+b));
    } 
    @Override 
    public void sub() // method must be public 
    {    
        int a=30,b=20;
        System.out.println("implements class B sub is "+ (a-b));
    }   
    public static void main(String[] args) {
        extin ref = new extin();
        ref.add();
        ref.sub();
    }

} 