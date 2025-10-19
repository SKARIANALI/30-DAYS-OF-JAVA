 
 // equals() method check only content same or not 
 
 
 class equ {
    public static void main(String[] args) {
        String a = "Lion";
        String b = new String("Lion");

        // Using .equals() method for content comparison
        if (a.equals(b)) {   //only content check same or not ;
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        String c = "Tiger";
        String d = "Tiger";

        if (c.equals(d)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        String e = "Tiger";
        String f = "Tigerr";  //content is false thats why it is  print false ;

        if (e.equals(f)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    
}
