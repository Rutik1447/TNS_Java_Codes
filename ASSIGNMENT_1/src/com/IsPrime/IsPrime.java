package com.IsPrime;

public class IsPrime {

	public static void main(String[] args) {

		int num=9;
		boolean isPrime=true;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}

	}

}
