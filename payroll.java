/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.grosspay;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class GrossPay {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        
System.out.println();
System.out.print("What is your name? :");
String Name = in.nextLine();
        
System.out.println();
System.out.print("How many hours did you work this week? :");
int hours = sc.nextInt();
        
System.out.println();
System.out.println("What is your hourly pay rate?");
Double payRate = sc.nextDouble();
        
System.out.println("Hello" +" " + Name);
Double grossPay = hours*payRate;

System.out.println();
System.out.println();
System.out.println("Your grosspay is $"+ grossPay);

        
    }
}
