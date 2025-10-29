                                      // java program to read a text from file //

// import java.io.*;
// class fileReader {
//     public static void main(String[] args) {
//         try
//         {
//             FileReader r = new FileReader("d:\\30daysjava\\day21\\createFile1.txt");
//             try
//             {
//                 int i; 
//                 while((i=r.read()) != -1)
//                 {
//                     System.out.print((char)i);
//                 }
//             }
//             finally
//             {
//                 r.close();
//                 System.out.println("\nFile Closed.");
//             }
//         }
//         catch(IOException e)
//         {
//             System.out.println("Exception Handled.");
//         }
//     }


    
// }


// import java.io.*;
// class fileReader {
//     public static void main(String[] args) throws IOException
//     {
//             FileReader r = new FileReader("d:\\30daysjava\\day21\\createFile1.txt");
//                 int i; 
//                 while((i=r.read()) != -1)
//                 {
               
//                     System.out.print((char)i);
//                 }
               
           
          
//                 r.close();  // we cannot guarantee that file must be closed //
//                 System.out.println("\nFile Closed.");
    

//             }
//         }

                                // Another java program to read a text from file //

//1.BufferedReader ------> // Using readLine() method //
//2.FileInputStream
//3.Scanner



// import java.io.*;
// class fileReader {
//     public static void main(String[] args) {
//         try {

//            BufferedReader f = new BufferedReader ( new FileReader ("d:\\30daysjava\\day21\\createFile1.txt")); 

//              try {
            
//                 String read;
//                 while((read=f.readLine()) != null)
//                 {
//                     System.out.print(read);
//                 }
//             }
//             finally
//             {
//                 f.close();
//                 System.out.println("\nFile Closed.");
//             }
//         } 
//         catch (IOException e) 
//         {
//             System.out.println(" exception handled " +e);
//         } 
//     }

// }



// import java.io.*;
// class fileReader {
//     public static void main(String[] args) {
//         try {

//            FileInputStream f = new FileInputStream ("d:\\30daysjava\\day21\\createFile1.txt"); 

//              try {
            
//                 int i; 
//                 while((i=f.read()) != -1)
//                 {
//                     System.out.print((char)i);
//                 }
//             }
//             finally
//             {
//                 f.close();
//                 System.out.println("\nFile Closed.");
//             }
//         } 
//         catch (IOException e) 
//         {
//             System.out.println(" exception handled " +e);
//         } 
//     }

// }





import java.io.*;
import java.util.Scanner;

class fileReader {
    public static void main(String[] args) {
        try {
            Scanner f = new Scanner(new File("d:\\30daysjava\\day21\\createFile1.txt"));

            try {
                while (f.hasNextLine()) 
                {
                    String data = f.nextLine();
                    System.out.println(data);
                }
            } 
            finally 
            {
                f.close();
                System.out.println("\nFile Closed.");
            }

        } catch (Exception e) {
            System.out.println("Exception handled: " + e);
        }
    }
}









