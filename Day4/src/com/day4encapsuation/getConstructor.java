package com.day4encapsuation;

import java.util.Scanner;

	class Person {
	    private int id;
	    private String name;
	    private int age;
	    public Person(int id, String name, int age) {
	        setId(id);
	        setName(name);
	        setAge(age);
	    }
	    public int getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public void displayInfo() {
	        System.out.println("ID: " + getId());
	        System.out.println("Name: " + getName());
	        System.out.println("Age: " + getAge());
	    }
}
public class getConstructor {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter ID: ");
	     int id = sc.nextInt();
	     sc.nextLine(); 
	     System.out.print("Enter Name: ");
	     String name = sc.nextLine();
	     System.out.print("Enter Age: ");
	     int age = sc.nextInt();
	     Person person = new Person(id, name, age);
	     System.out.println("User Info");
	     person.displayInfo();
	     sc.close();
	}
}


