package com.day4encapsuation;

public class OopsConcept {
	private int serialNum;
	private String name;
	private int age;
	
	//Getter & Setter
	
	public void setSerialNum(int serialNum) {
		this.serialNum=serialNum;
	}
	public int getserialNum() {
		return serialNum;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	@Override
	public String toString() {
		return "OopsConcept [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
}
