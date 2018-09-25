/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewriting;

/**
 *
 * @author Huguette
 */
import java.io.*;
import java.util.Scanner;
public class FileWriting {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        FileWriter fileWrite= new FileWriter("practice.txt",true);
        PrintWriter writer = new PrintWriter(fileWrite);
        writer.print("Frist");
        writer.print("Frist");
        writer.print("huette");
        writer.close();
      
        
        
        
        
        File  myFile= new File("practice.txt");
        Scanner input = new Scanner (myFile);
        String first;
        
        while (input.hasNext()){
        first = input.next();
    
        System.out.println(first);
        input.close();
        }
        
        }
    
}
