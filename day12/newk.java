 
 // Using new keyword 

 // Memory HEAP create 
 
 class newk {
    public static void main(String[] args) {
        String a = new String("Arian");  //here String is a final predefined class 
        String b = new String("Arian");

        System.out.println(a);
        System.out.println(b);


        a.concat("ali");   // donot bcz String are immutable
        b.concat("ali");
        System.out.println(a); 
        System.out.println(b);


        a=a.concat(" ali");  //new obj creation for a and  first one is destroy
        System.out.println(a);


        b=b.concat(" alii");  //new obj creation for b and  first one is destroy
        System.out.println(b);


       a="sk";  // new obj create for  a but b is same 
       System.out.println(a);






    }

    
}
