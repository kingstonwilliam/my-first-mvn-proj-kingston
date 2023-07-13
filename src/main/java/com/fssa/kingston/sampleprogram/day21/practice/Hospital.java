package com.fssa.kingston.sampleprogram.day21.practice;

public class Hospital {
	public String hospitalName;
	public String hospitalAddress;
	public String district;
	public int pincode;
	public String license;
	public int number;
	public String emailId;
	public String bloodGroup;

	public String getName() {
		return hospitalName;
	}

	public void setName(String name) {
		this.hospitalName = name;
	}

	public String getAddress() {
		return hospitalAddress;
	}

	public void setAddress(String Address) {
		this.hospitalAddress = Address;
	}

	public String getdistrict() {
		return district;
	}

	public void setdistrict(String district) {
		this.district = district;
	}

	public int getpincode() {
		return pincode;
	}

	public void setpincode(int pincode) {
		this.pincode = pincode;
	}

	public String getlicense() {
		return license;
	}

	public void setlicense(String license) {
		this.license = license;
	}

	public int getnumber() {
		return number;
	}

	public void setnumber(int number) {
		this.number = number;
	}

	public String getemailId() {
		return emailId;
	}

	public void setemailId(String emailId) {
		this.emailId = emailId;
	}

	public String getbloodGroup() {
		return bloodGroup;
	}

	public void setbloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
