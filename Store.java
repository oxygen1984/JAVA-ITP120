// File processing
import java.util.Scanner;
import java.io.*;
public class Store
{
   public static void main(String[] args) throws IOException
   {
      Scanner input = new Scanner(System.in);
      FileWriter outputFile = new FileWriter("student.txt", true);
      PrintWriter fileOfData = new PrintWriter(outputFile);
      int numberOfNames = 0;
      System.out.println("How many names?");
      numberOfNames = input.nextInt();
      for(int i = 1; i <= numberOfNames; i++)

      {
         System.out.println("Enter first name");
         String firstname = input.next();
         fileOfData.println(firstname);
         System.out.println("Enter last name");
         String lastname = input.next();
         fileOfData.println(lastname);
         System.out.println("Enter id");
         String id = input.next();
         fileOfData.println(id);
      }
      fileOfData.close();


   }
}