package com.day5inheritance;

public class citizen {
	private String name;
	private long adharno;
	private String address;
	private long phonno;
	
	public citizen() {
		System.out.println("Citizen object created");
	}
	
	public citizen(String name, long adharno, String address, long phonno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.address = address;
		this.phonno = phonno;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhonno() {
		return phonno;
	}
	public void setPhonno(long phonno) {
		this.phonno = phonno;
	}
	
	@Override
	public String toString() {
		return "citizen [name=" + name + ", adharno=" + adharno + ", address=" + address + ", phonno=" + phonno + "]";
	}	
}
