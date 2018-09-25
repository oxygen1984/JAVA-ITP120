/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsandthings;

import java.util.Scanner;

/**
 *
 * @author Huguette
 */
public class StringsandThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String firstName = "not filled in ";
       String lastName = "not filled in";
       int age = 0;
       int birthYear = 1899;
       final int currentYear = 2018;
       int numericGrade = 0;
       String letterGrade ="F";
       int x =0;
        
     Scanner input  = new Scanner (System.in);  
     System.out.println("Enter your first name ");
     firstName = input.next();
     System.out.println("Enter your last name ");
     lastName = input.next();
     if(firstName.equals("hacker") || lastName.equals("hacker")) 
         {
     System.out.println("Not allowed");
     System.exit(0);
        }
     System.out.println("Enter the year you were born ");
     birthYear = input.nextInt();
     
     if ((birthYear < 1900) || (birthYear > currentYear))
     {
         System.out.println("Valid range is 1900 - 2018  : re-enter");
         birthYear = input.nextInt();
     }
     age = currentYear - birthYear ;
     System.out.println("You are "+ age + " years old "+ firstName + " " +lastName);
     System.out.println("Enter your numeric grade");
     numericGrade = input.nextInt();
     if (numericGrade >= 90)
         
        {
         letterGrade = "A";
        }
     else 
         if(numericGrade >= 80)
             
         {
             letterGrade = "B";
         }
         else 
             
             if (numericGrade >= 70)
             {
                 letterGrade = "C";
             }
             else 
             {
                 letterGrade = "F";
             }
     
     
System.out.println("Your letter grade is " + letterGrade);
     switch (x = numericGrade/10)
             
      {
          
          case 10 :
            letterGrade = "A";
          break;
          case 9 :
            letterGrade = "A";
          break;
          case 8 :
            letterGrade = "B";
          break;
          case 7 :
            letterGrade = "C";
          break;
          default  : 
            letterGrade ="F";
          break;
                 
             }
     
      System.out.println("Your switch letter is "+ letterGrade);
     
      System.out.println("Calcul your grade " + x + " out of  10") ;
     
     
     
        }

    }
    

