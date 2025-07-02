package com.day2conditionandloop;

public class Switchcase {
	public static void main(String[]args) {
	char x='l';
	switch(x) { 
	case 'l':
		System.out.println("This code contain letters.");
		break;
	case 'd':
		System.out.println("This code contain digits.");
		break;
	case 's':
		System.out.println("This code contain symbol.");
		break;
	case 'w':
		System.out.println("This code contains whitespace.");
		break;
	default:
		System.out.println("This code does not contain any letters,digits,symbol or whitespace.");
		break;
		}
	}
}
//https://github.com/Rutik1447/TNS_Java_Codes.git