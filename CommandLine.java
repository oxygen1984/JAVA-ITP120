

import java.util.Scanner;
import java.io.Console;

/**
 *
 * @author Huguette
 */
public class CommandLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
      int age;
      int currentYear = 2018;
      int birthYear ;// valid range is 1924 - 2018
      int attemps= 0;
        Console c = System.console();
        String name = c.readLine("What is your name");
      System.out.println("Enter your birth year - 1924 though 2018");

      birthYear = input.nextInt();
      while (birthYear < 1924  || birthYear > 2018 )
              {
                  System.out.println("Valid range is 1924 to 2018");
                  birthYear = input.nextInt();
              }
      age = currentYear - birthYear;
      System.out.println("Your age is " + age);
      System.out.println("Your first name is " + name);




    }

}
