package com.CanDonateBlood;

public class CanDonateBlood {

	public static void main(String[] args) {
		int age=25;
		boolean isIll=false;
		
		if(age>=18 && age<=60 && !isIll) {
			System.out.println("You can donate blood");
		}else {
			System.out.println("You cant donate blood");
		}

	}

}
