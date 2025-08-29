/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.eryzaa;

import java.util.Scanner;

/**
 *
 * @author CL2~PC27
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            int repeat = 0;                                                                                      
         int exit = 0;
      Scanner input = new Scanner (System.in);
        System.out.println("Cafeteria");
        System.out.println("[A} = Drinks");
        System.out.println("[B] = Snacks");
        System.out.println("[C] = Exit");
        
        
        char Cafe = input.next().charAt(0);
        
            if (Cafe=='A'||Cafe=='a'){
              System.out.println("Drinks");
              System.out.println("[A} = Wateh - 50");
              System.out.println("[B] = Cowk - 60");
              System.out.println("[C] = Matcha - 80");  
              System.out.println("[D] = Cappuccino - 70");
              System.out.println("[E] = Exit");
              
              int Wateh = 50;
              int Cowk = 60;
              int Matcha = 80;
              int Cappuccino = 70;
              
              System.out.println("choose your Drinks:");
              char drinks = input.next().charAt(0);
            
             if (drinks=='a' || drinks=='b' || drinks=='c' || drinks=='d'){
                  System.out.println("Enter the quantity:");
                  int quantity = input.nextInt();
                  
                  int total = 0;
                  
                  switch(drinks){
                        case 'a':
                          
                        total = Wateh * quantity;
                        System.out.println("total is: " + total);
                          break;
                          case 'b':
                          
                        total = Cowk * quantity;
                        System.out.println("total is: " + total);
                          break;
                          case 'c':
                          
                        total = Matcha * quantity;
                        System.out.println("total is: " + total);
                          break;
                          case 'd':
                          
                        total = Cappuccino * quantity;
                        System.out.println("total is: " + total);
                          break;
                           default: 
                              System.out.println("Invalid!");
                  }
                  System.out.println("Enter your cash:");
                  int cash = input.nextInt();
                  
                  int balance = cash - total;
                  
                  System.out.println("your balance is: " + balance);
                  

            System.out.println("PRESS [1] TO ORDER AGAIN");
             repeat = input.nextInt();
            
            if (repeat==1){
                repeat = 1;
            }
            else{
                System.out.println("Invalid!");
            }
             }
             else if (drinks=='e'||drinks=='E'){
                 exit = 1;
            }
             else {
                 System.out.println("Invalid!");
             }
             
            }
  
            else if (Cafe=='B'||Cafe=='b'){
              System.out.println("Snacks");
              System.out.println("[A} = Donut - 25");
              System.out.println("[B] = Cupcake - 40");
              System.out.println("[C] = Cake - 60");  
              System.out.println("[D] = Cookie - 25");
              System.out.println("[E] = Exit");
              
              int Donut = 25;
              int Cupcake = 40;
              int Cake = 60;
              int Cookie = 25;
              
              System.out.println("choose your Snacks:");
              char Snacks = input.next().charAt(0);
            
             if (Snacks=='a' || Snacks=='b' || Snacks=='c' || Snacks=='d')
             {
                  System.out.println("Enter the quantity:");
                  int quantity = input.nextInt();
                  
                  int total = 0;
                  
                  switch(Snacks){
                        case 'a':
                          
                        total = Donut * quantity;
                        System.out.println("total is: " + total);
                          break;
                          case 'b':
                          
                        total = Cupcake * quantity;
                        System.out.println("total is: " + total);
                          break;
                          case 'c':
                          
                        total = Cake * quantity;
                        System.out.println("total is: " + total);
                          break;
                          case 'd':
                          
                        total = Cookie * quantity;
                        System.out.println("total is: " + total);
                          break;
                          default: 
                              System.out.println("Invalid!");
                  }
                  System.out.println("Enter your cash:");
                  int cash = input.nextInt();
                  
                  int balance = cash - total;
                  
                    System.out.println("your balance is: " + balance);
                    System.out.println("PRESS [1] TO ORDER AGAIN");
                    repeat = input.nextInt();
            
            if (repeat==1){
                repeat = 1;
            }
             }
             else if (Snacks=='e'||Snacks=='E'){
                 exit = 1;
            }
             else {
                 System.out.println("Invalid!");
             }
            }
            else if (Cafe=='c'||Cafe=='C'){
                
            }
    
            
        else {
            System.out.println("wrong password or username");
        
    }
}

}
