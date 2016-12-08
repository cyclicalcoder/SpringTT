package com.adb.spring.test;

public class Address {

	private String street;
	private String zipcode;

	public Address() {

	}

	public Address(String street, String zipcode) {
		this.street = street;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {

		return "Address [street=" + street + ", zipcode=" + zipcode + "]";
	}

	public void init() {
		System.out.println("Address initiated");
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
