/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatelogin;

import java.util.Scanner;

/**
 *
 * @author Huguette
 */
public class ValidateLogin {
Scanner input = new Scanner (System.in);
        String loginSendID = null;
        String passSendWordID = null;
      public void  validLogin()
    
    {

        
        checkLogin();
        checkpassWord();
     
    }
         
    public void checkLogin()
    
    {
        
        
       String loginID;
       System.out.println("Enter your login");
       loginID = input.next();
       boolean loginCheck;
       
       while (loginID.length() < 3) {          
           
        System.out.println("Must be 3 or more characters - re-enter");
        loginID = input.next();

       }
       loginSendID = loginID;
       }
    

    
    
     
    public void checkpassWord()
    
    {
        String passWord;
        System.out.println("Enter your password");
        passWord=input.next();
        boolean pswdCheck;
        int count = 0;
        
        if (count < 3)
        while (passWord.length() < 3 && count <= 3) {
           
           
        System.out.println("Must be 3 or more characters - re-enter");
        passWord = input.next();
        count++;
       }
        
      if (count >3)
      passSendWordID = passWord; 
        
    }
    
}
    
   // public static void main(String[] args) {
        // TODO code application logic here
    
    
