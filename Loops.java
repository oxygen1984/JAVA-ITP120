/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author Huguette
 */
public class Loops {

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
      String name = "";
      System.out.println("Enter your birth year - 1924 though 2018");

      birthYear = input.nextInt();
      while (birthYear < 1924  || birthYear > 2018 )
              {
                  System.out.println("Valid range is 1924 to 2018");
                  birthYear = input.nextInt();
              }
      age = currentYear - birthYear;
      System.out.println("Your age is " + age);
      System.out.println("Enter your name ");
      name = input.next();
      while (name.equalsIgnoreCase("Hacker"))
              {
                  attemps++;
                  if (attemps > 3)
                  
                  {
                  System.out.println("Attemps exceeded");
                  System.exit(0);

                  } 
                 else 
                      
                 {
                  System.out.println("Hackers are not allow");
                  name = input.next();
                 } 
      
      System.out.println("Your first name " + name); 
        
        
        
        
    }

    
}
}
