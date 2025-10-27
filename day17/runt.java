                                // Method Overriding //
 
                    // super and classes method name and parameter is same   //                             

// if  methods are  diff then always we get output for super class //

class A
{
   void draw()
   {
    System.out.println("Can't say shape type ");
   }
}

class B extends A
{  
   @Override   // must be write 

  void draw()
   {
       super.draw(); // using super keyword we can access super class method 
    System.out.println("square shape ");
   }
}

class runt 
{
    public static void main(String[] args) {
        B ref=new B();
        // A ref=new B();   // We write this also 
        ref.draw();
    }
    
}
