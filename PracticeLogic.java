/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicelogic;

import java.util.Scanner;

/**
 *
 * @author Huguette
 */
public class PracticeLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int userSize;
        int userStyle;
        int sizeOne=5;
        int sizeTwo = 7;
        int styleOne = 2300;
        int styleTwo= 3300;
        System.out.println("Enter size number");
        userSize = input.nextInt();
        System.out.println("Enter style number");
        userStyle=input.nextInt();
        if((userSize == sizeOne) && (userStyle == styleOne) || (userSize == sizeOne) && (userStyle == styleTwo) || (userSize == sizeTwo) && (userStyle == styleOne) || (userSize == sizeTwo) && (userStyle == styleTwo) )
        {
                System.out.println("In stock");
        }
        else 
        {
             System.out.println("out stock");
        }
    }
}
    
    
