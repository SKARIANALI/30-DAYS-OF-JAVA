                                         // Encapsulation //

                // var as a private and method as a public //

class A
{
   private int value ;  // data hidding 

   public void setValue(int x)  // data abstraction 
    {
        value=x;      
    }
    public int getValue()
    {
        // return value; 
        return ++value;   
    }
}

class encap {
    public static void main(String[] args) {
        A ref= new A();
        // ref.value=100; // not accessable bcz var is private 
        ref.setValue(100);
        System.out.println(ref.getValue());
    }
    
}
