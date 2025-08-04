package com.day2conditionandloop;
import java.util.Scanner;
public class Blooddonation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();
	        System.out.print("Enter your weight (in kg): ");
	        int weight = sc.nextInt();
	        if (age >= 18 && weight >= 50) {
	            System.out.println("You are eligible to donate blood.");
	        } else {
	            System.out.println("You are not eligible to donate blood.");
	        }
	        sc.close();
	}
}
