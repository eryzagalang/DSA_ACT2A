/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.eryzaa;
import java.util.HashSet;

/**
 *
 * @author CL2~PC27
 */
public class hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate
    cars.add("Mazda");
    System.out.println(cars);
	}
}


