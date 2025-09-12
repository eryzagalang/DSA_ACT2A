/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.eryzaa;
import java.util.HashMap;

/**
 *
 * @author CL2~PC27
 */
public class hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
	}
}

