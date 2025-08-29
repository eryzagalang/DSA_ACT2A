                                 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eryzaa;
import java.util.Scanner;
/**
 *
 * @author CL2~PC13
 */
public class Eryzaa {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
          System.out.println( "Rock- [1]");
           System.out.println( "Paper- [2]");
           System.out.println( "Scisscors- [3]");
           

        System.out.println( "Enter your choice player 1: ");
        int p1= Integer.parseInt(input.nextLine());
        
        System.out.println( "Enter your choice player 2:");
        int p2= Integer.parseInt(input.nextLine());
        
     if (p1 == 1 && p2==1)
     {
           System.out.println("Draw");
     }
    else  if (p1 == 2 && p2==2)
     {
           System.out.println("Draw");
     }
      else if (p1 == 3 && p2==3)
     {
           System.out.println("Draw");
     }
     else if  (p1 == 1 && p2== 2 ) 
     {
          System.out.println("Player 2 Wins");
 
     }
     else if  (p1 == 2  && p2==1) 
     {
          System.out.println("Player 1 Wins");
 
     }
     else if  (p1 == 3 && p2==2) 
     {
          System.out.println("Player 1 Wins");
 
     }
     else if  (p1 ==2 && p2==3) 
     {
          System.out.println("Player 2 Wins");
 
     }
       else if  (p1 == 1 && p2==3) 
     {
          System.out.println("Player 1 Wins");
 
     }
      else if  (p1 == 3 && p2==1) 
     {
          System.out.println("Player 1 Wins");
 
     }
     
    
    }
}
