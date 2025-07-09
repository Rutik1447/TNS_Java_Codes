package com.day5inheritance;

public class Employee extends person{
	int empid=301;
	String companyname="TNS";
	public void empdetail() {
		System.out.println(empid+" "+ name + " "+  companyname+" " );
	}
}
