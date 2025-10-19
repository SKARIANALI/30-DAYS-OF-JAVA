
//A String is an object that represents a sequence of characters.


 class methods {
    public static void main(String[] args) {
        String a = "SK";
        String b = "ARIAN";
        String c = "ali";

        System.out.println(a.toLowerCase());    //upper to lower 
        System.out.println(b.toLowerCase());

        System.out.println(c.toUpperCase());    // lower to upper 

         System.out.println(a.concat(b));               //concat() method 

         System.out.println(b.length());   //find length of a char length() method 

         String d="       ARIAN     ";
         System.out.println(d.trim());  //trim method 


         String e="";

         String f="     ";
         System.out.println(e.isEmpty());  //isEmpty() method to find a string is  empty or not 
         System.out.println(f.isEmpty()); //return false bcz of space 



        String g = "Lion";
        String h = "Tiger";

        System.out.println(g.charAt(1));   //charAt() method to find position of a char
        System.out.println(h.charAt(2));



        System.out.println(g.indexOf('i'));   // find index of char indexOf() method 
        System.out.println(h.indexOf('g'));


        System.out.println(g.equals(h));  //equals() method 


        //(var.replace('oldChar', 'newChar')); 

         System.out.println(g.replace('i', 'g')); //replace() method 
         System.out.println(h.replace('i', 'o')); 
       

   }


    
}



