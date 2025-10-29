                                            // Java program to create a File //


// import java.io.*;
// class createFile 
// {
//     public static void main(String[] args) {
//         File f = new File("d:\\30daysjava\\day21\\createFile.txt");
//         try {
//             if (f.createNewFile()) {
//                 System.out.println("File successfully created.");
//             } else {
//                 System.out.println("File already exists.");
//             }
//         } catch (IOException i) {
//             System.out.println("An unexpected error occurred." + i);
//         }
//     }

// }




import java.io.*;
class createFile 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("d:\\30daysjava\\day21\\createFile.txt"); // File is a superclass //

            if (f.createNewFile())    // createNewFile() is a method //
            {
                System.out.println("File successfully created.");
            } 
            else 
            {
                System.out.println("File already exists.");
            }
        } 
}

