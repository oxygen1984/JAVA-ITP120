/*
 program that reads the student.txt file using the File class and Scanner
 */
package readfile;

/**
 *
 * @author Huguette
 */
import java.io.*;
import java.util.Scanner;
public class ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
    
        File myfile = new File ("student.txt");
        Scanner inputFile = new Scanner(myfile);
        while (inputFile.hasNext()){
        String line = inputFile.nextLine();
        System.out.println(line);
        }
       
        inputFile.close();
        
    
    }
    
}
