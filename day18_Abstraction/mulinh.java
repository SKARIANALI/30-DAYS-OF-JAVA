                                                  // multiple inheritance //
// both reqr are same 

// interface A {
//     void show();
// }

// interface B {

//     void show();

// }

// class mulinh implements A, B 
// {
//     public void show() // method must be public 
//     {
//         System.out.println(" implements class A and B ");
//     }   
//     public static void main(String[] args) {
//         mulinh ref = new mulinh();
//         ref.show();
//     }

// } 





// both reqr are diff


interface A {
    void show();
}

interface B {

    void disp();

}

class mulinh implements A, B 
{   
    @Override
    public void show() // method must be public 
    {
        System.out.println("implements class A  ");
    } 
    @Override 
    public void disp() // method must be public 
    {
        System.out.println("implements class B ");
    }   
    public static void main(String[] args) {
        mulinh ref = new mulinh();
        ref.show();
        ref.disp();
    }

} 
