
// import java.io.*;
// class renameFile {
//     public static void main(String[] args) {
//         File oldFile = new File("d:\\30daysjava\\day21\\createFile.txt");
//         File newFile = new File("d:\\30daysjava\\day21\\renamedFile.txt");

//         if (oldFile.exists()) {
//             if (oldFile.renameTo(newFile)) {
//                 System.out.println("File renamed successfully.");
//             } else {
//                 System.out.println("Failed to rename file.");
//             }
//         } else {
//             System.out.println("File does not exist.");
//         }
//     }

    
// }



// vice-versa //

import java.io.*;
class renameFile {
    public static void main(String[] args) {
        File oldFile = new File("d:\\30daysjava\\day21\\createFile.txt");
        File newFile = new File("d:\\30daysjava\\day21\\renamedFile.txt");

        if (newFile.exists()) {
            if (newFile.renameTo(oldFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    
}
