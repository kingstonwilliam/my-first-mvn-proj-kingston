package com.fssa.kingston.sampleprogram.day21.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fssa.kingston.sampleprogram.day20.practice.Student;

public class HospitalValidator {
	public static boolean validate(Hospital hospital) throws IllegalArgumentException {

		// check for nullity of the parameter
		if (hospital == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
		// Check for name, name should only have alphabets
		// For Simplicity, Check if name has length of 2.
		HospitalName(hospital.hospitalName);
		HospitalAddress(hospital.hospitalAddress);
		Hospitaldistrict(hospital.district);
		Hospitalpincode(hospital.pincode);
		HospitalEmail(hospital.emailId);
		HospitalLicense(hospital.license);
		
		
		return true;
	}

	public static boolean HospitalName(String hospitalName) throws IllegalArgumentException {
		if (hospitalName == null || "".equals(hospitalName.trim()) || hospitalName.length() < 2) {
			throw new IllegalArgumentException("Hospital Name can not be empty or null");
		}
		return true;
	}

	public static boolean HospitalAddress(String hospitalAddress) throws IllegalArgumentException {
		if (hospitalAddress == null || "".equals(hospitalAddress.trim()) || hospitalAddress.length() < 8) {
			throw new IllegalArgumentException("Hospital Address " + "be empty or null");
		}
		return true;
	}
	
	public static boolean Hospitaldistrict(String district)throws IllegalArgumentException{
		if (district == null || "".equals(district.trim()) || district.length() < 5) {
			throw new IllegalArgumentException("Hospital district " + "be empty or null");
		}
		return true;
	}
	public static boolean Hospitalpincode(int pincode)
			throws IllegalArgumentException {

		if (pincode > 1000 && pincode < 1000000) {
			return true;
		} else {
			throw new IllegalArgumentException("pincode is not valid");
		}

	}
	public static boolean HospitalEmail(String emailId)
			throws IllegalArgumentException {
		// Below is a Regex by RFC standard RFC 5322
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);
		Boolean isMatch = matcher.matches();
//				Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			return true;
		} else {
			throw new IllegalArgumentException("The email address is: Invalid");
		}
	}
	public static boolean HospitalLicense(String license) 
	             throws IllegalArgumentException{
		if (license == null || "".equals(license.trim()) || license.length() < 8) {
			throw new IllegalArgumentException("Hospital License " + "be empty or null");
		}
		return true;
	            	 }
	            	 
	            	 
	             



}
