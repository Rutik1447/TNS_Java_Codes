package com.day4encapsuation;
import java.util.Scanner;
public class Constructor {
	//default constructor
	public Constructor(){
		System.out.println("Default constructor");
	}
	//parameterized constructor
	public Constructor(int id,String name,int age) {
		System.out.println("Parameterized constructor");
		System.out.println(id + ","+name+","+age);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id:");
		int id= sc.nextInt();
		System.out.println("Enter Name:");
		String name= sc.next();
		System.out.println("Enter Age:");
		int age= sc.nextInt();
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor(id,name,age); 
	}
}
