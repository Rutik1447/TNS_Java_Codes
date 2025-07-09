package com.day5inheritance;

public class Student extends citizen {
	private int rollno;
	private String collegename;
	public Student() {
		super();
	}
	
	public Student(String name, long adharno, String address, long phonno) {
		super(name, adharno, address, phonno);
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + ", getAdharno()=" + getAdharno()
				+ ", getAddress()=" + getAddress() + ", getPhonno()=" + getPhonno() + "]";
	}
}
