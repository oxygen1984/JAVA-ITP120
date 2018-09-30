// printing
import java.util.Scanner;
import java.io.*;
public class Store2
{
   public static void main(String[] args) throws IOException
   {
      Scanner input = new Scanner(System.in);
      File toReadFile = new File("student.txt");
      Scanner inputFile = new Scanner(toReadFile);


      while(inputFile.hasNext())
      {
         String data = inputFile.nextLine();

      System.out.println(data);
      }

   }
}
