package com.adb.spring.test;

public class Person {

	private int id;
	private String name;
	private int taxId;
	private Address addresss;

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person() {

	}

	public Person(int id, String name) {
		System.out.println("inside person's parametrized constructor ");
		this.id = id;
		this.name = name;
	}
	
	public void init(){
		System.out.println("person is initiated");
	}
	
	public void destroy(){
		System.out.println("person is destroyed");
	}

	public void display() {

		System.out.println("Hello World .. I am a person!!!!!!");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + addresss + "]";
	}

	public void setAddresss(Address address) {
		this.addresss = address;
	}

}
