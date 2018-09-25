/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calgrade;

import java.util.Scanner;

/**
 *
 * @author Huguette
 */
public class CalGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
       Scanner input = new Scanner(System.in);
       int total = 0;
       int grade;
       int average;
       int numofGrades=0;
       int sentinalValue = -1;
                
       System.out.println("Enter the grade");  
       grade = input.nextInt ();
       while (grade != sentinalValue){
  
          total = total + grade;
          numofGrades++;
          System.out.println("Enter the grade");  
          grade = input.nextInt ();
          }
       
      if (numofGrades !=0) {
     average = total/numofGrades;
     System.out.println("Average is " + average);  
     
      }
    }
    
}
