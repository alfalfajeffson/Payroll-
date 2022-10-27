/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.temperature;

import java.util.Scanner;

/**
 *
 * @author User
 */

public class Temperature {
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
    System.out.println();
    System.out.print("Please! enter your temperature in Degree Celcius: ");
    Double C = sc.nextDouble();
    
    System.out.println();
    Double Fahrenheit = (1.8*C) + 32;
        System.out.println("Hey!," + "Your temperature in Fahrenheit is " + Fahrenheit + " "+"(F)");
    }
}
