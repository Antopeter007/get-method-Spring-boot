package com.example.web;

public class employee {
	private String name;
	private double sal;
	private String address;
	private String number;
	public String getName() {
		return name;
	}
	public employee(String name, double sal, String address, String number) {
		super();
		this.name = name;
		this.sal = sal;
		this.address = address;
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}
