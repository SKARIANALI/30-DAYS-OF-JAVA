                              // Abstraction //
              // Hidding the implementation details from the user //

            // 2 types 
            //   1. Abstract class (20% me : 80 % developer) ; 2. Interface (100% developer) //


// Rule:1 
// donot create obj for abstract class but create ref for abs class 

// abstract class Animal
// {

// }

// class Dog extends Animal{

// }

// class abs
// {
//     public static void main ( String[] args)
//     {
//         Animal ref= new Dog();  // we create abs class ref but not obj 
//     }
// }


// abstract class Animal
// {
//     public abstract void eat();
// }

// class Dog extends Animal
// {
//      public void eat()
//      {
//         System.out.println("dog eat meat");
//      }
// }

// class Cat extends Animal
// {
//     public void eat()
//      {
//         System.out.println("cat eat milk");
//      }
// }

// class abs
// {
//     public static void main ( String[] args)
//     {
//         Dog ref= new Dog();
//         ref.eat();  
//         Cat ref2=new Cat();
//         ref2.eat();
//     }
// }











abstract class Animal
{  

     Animal() // non abst method implement
     {
        System.out.println("All animals ");
     }
    
    public abstract void eat(); 
}

class Dog extends Animal
{    
     Dog() 
     {   
        super();  // call abst class constuctor 
        System.out.println(" Dog ");
     }
     public void eat()
     {
        System.out.println("dog eat meat");
     }
}

class Cat extends Animal
{    
    Cat() 
     {   
        super();
        System.out.println(" Cat ");
     }
    public void eat()
     {
        System.out.println("cat eat milk");
     }
}

class abs
{
    public static void main ( String[] args)
    {
        Dog ref= new Dog();
        ref.eat();  
        Cat ref2=new Cat();
        ref2.eat();
    }
}


