                                       // java program to write into a file //


// import java.io.*;
// class fileWriter {
//     public static void main(String[] args) {
//         try {

//         FileWriter f = new FileWriter("d:\\30daysjava\\day21\\createFile1.txt"); //  FileWriter is a class //
//             try
//             {
//               f.write("Files in Java are seriously easy to handle.");
//             }
//             finally
//             {
//                 f.close();
//             }
//             System.out.println("Successfully wrote.");
//         } 
//         catch (IOException e) 
//         {
//             System.out.println("An error occurred." +e);
//         }
//     }

// }




                                // Another java program to write into a file //
// 1.BufferedWriter
//2.FileOutputStream
//3.PrintWriter


// import java.io.*;
// class fileWriter {
//     public static void main(String[] args) {
//         try {

//         BufferedWriter f = new BufferedWriter ( new FileWriter ("d:\\30daysjava\\day21\\createFile1.txt")); 

//             try
//             {
//               f.write("Files in Java are seriously easy to handle.");
//               f.newLine(); // Inserts a new line
//               f.write("This is the second line."); 

//             }
//             finally
//             {
//                 f.close();
//             }
//             System.out.println("Successfully wrote.");
//         } 
//         catch (IOException e) 
//         {
//             System.out.println("An error occurred." +e);
//         }
//     }

// }




// import java.io.*;
// class fileWriter {
//     public static void main(String[] args) {
//         try {

//             FileOutputStream f = new FileOutputStream("d:\\30daysjava\\day21\\writerFile1.txt"); // file create + write //

//             try
//             {  
//                String content = "Files in Java are seriously easy to handle.";
//                 f.write(content.getBytes());
//             }
//             finally
//             {
//                 f.close();
//             }
//             System.out.println("Successfully wrote.");
//         } 
//         catch (IOException e) 
//         {
//             System.out.println("An error occurred." +e);
//         }
//     }

// }


// import java.io.*;
// class fileWriter {
//     public static void main(String[] args) {
//         try {

//             PrintWriter f = new PrintWriter("d:\\30daysjava\\day21\\writerFile2.txt");

//             try
//             {  
//                f.write("Files in Java are seriously easy to handle.");
                
//             }
//             finally
//             {
//                 f.close();
//             }
//             System.out.println("Successfully wrote.");
//         } 
//         catch (IOException e) 
//         {
//             System.out.println("An error occurred." +e);
//         }
//     }

// }


