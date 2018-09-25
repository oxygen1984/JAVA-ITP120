/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangle2;

import java.util.Scanner;

/**
 *
 * @author Huguette
 */
public class AreaTriangle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        double height;
        double width;
        double area;
        System.out.println("Enter the height of the triangle");
        height = input.nextDouble();
        System.out.println("Enter the width of the triangle "); 
        width = input.nextDouble();
        area = 0.5 * height* width;
        System.out.println("The Area of the triangle is " + area );
       

        
        
    }
    
}
