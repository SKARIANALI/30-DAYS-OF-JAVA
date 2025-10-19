 class rev {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);  //using charAt(i) method bcz one by one char rev
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}



//StringBuffer and StringBuilder Class its a predefined class for reverse a string ;


// class rev{
//     public static void main(String[] args) {
//         String originalString = "Hello World";

//         // Using StringBuffer
//         StringBuffer r = new StringBuffer(originalString);
//         String reversed = r.reverse().toString();
//         System.out.println("Original String: " + originalString);
//         System.out.println("Reversed with StringBuffer: " + reversed);

//         // Using StringBuilder
//         StringBuilder ref = new StringBuilder(originalString);
//         String reversedWithStringBuilder = ref.reverse().toString();

//         // String reversedWithStringBuilder = ref.reverse();  //StringBuilder cannot be converted to String

//         System.out.println("Reversed with StringBuilder: " + reversedWithStringBuilder);
//     }

// }






// class rev{
//     public static void main(String[] args) {
//         // Using StringBuffer
//         StringBuffer r = new StringBuffer("Hello World");
//         System.out.println("Reversed with StringBuffer: " + r.reverse());

//         // Using StringBuilder
//         StringBuilder ref = new StringBuilder("Arianali");
//         System.out.println("Reversed with StringBuilder: " + ref.reverse());
//     }

// }