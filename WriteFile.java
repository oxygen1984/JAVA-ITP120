/*
Program  that writes student information to a file.
 */
package writefile;


import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Huguette
 */
public class WriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    
    String firstName;
    String lastName;
    String id;
    
    FileWriter myfile = new FileWriter ("student.txt",true);
    PrintWriter writer = new PrintWriter(myfile);
    Scanner input  = new Scanner (System.in); 
    
    writer.print("Firstname ");
    writer.print("Lastname  ");
    writer.print("Student id");
    writer.println();
    
    for (int i=1; i<=5; i++) {
    
    System.out.println("Enter the first name of the student #" + i);
    firstName = input.next();
    System.out.println("Enter the last name of the student #"+ i);
    lastName = input.next();
    System.out.println("Enter the ID of the student #" + i);
    id = input.next();
    writer.print(firstName+ " ");
    writer.print(lastName+ " ");
    writer.print(id);
    writer.println();
    
    } 
    writer.close();
    }
    
}
