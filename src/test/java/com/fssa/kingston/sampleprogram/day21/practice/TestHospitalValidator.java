package com.fssa.kingston.sampleprogram.day21.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.kingston.sampleprogram.day21.practice.Hospital;
import com.fssa.kingston.sampleprogram.day21.practice.HospitalValidator;


import org.junit.Assert;
//import org.junit.Test;

public class TestHospitalValidator {

    @Test
    public void testValidHospital() {
        Hospital hospital = new Hospital();
        hospital.setName("ABC Hospital");
        hospital.setAddress("123 Main Street");
        hospital.setdistrict("XYZ District");
        hospital.setpincode(621001);
        hospital.setemailId("abc@example.com");
        hospital.setlicense("ABC12345");

        boolean isValid = HospitalValidator.validate(hospital);
        Assert.assertTrue(isValid);
    }

    @Test
  
    public void testNullHospital() {
    	try {
    		HospitalValidator.validate(null);
    	}
    	catch(IllegalArgumentException e) {
    		Assertions.assertEquals("Argument is " + "NULL", e.getMessage());
    	}
    }
    
    @Test
    public void testValidHospitalName() {
    	Assertions.assertTrue(HospitalValidator.HospitalName("Kinston Hospital"));
    }

    @Test
    public void testInvalidHospitalName() {
    	try {
        Hospital hospital = new Hospital();
        hospital.setName("");
        HospitalValidator.validate(hospital);
    	}
    	catch(IllegalArgumentException e) {
    		Assertions.assertEquals("Hospital Name can not be empty or null",  e.getMessage());
    	}
    }
    @Test
    public void testValidHospitalAddress() {
    	Assertions.assertTrue(HospitalValidator.HospitalAddress("#176,m.g.r,nagar puzhal"));
    }

    @Test
   
    public void testInvalidHospitalAddress() {
    	try {
        Hospital hospital = new Hospital();
        hospital.setName("ABC Hospital");
        hospital.setAddress("");
        HospitalValidator.validate(hospital);
    }
    	catch(IllegalArgumentException e) {
    		Assertions.assertEquals("Hospital Address " + "be empty or null",e.getMessage());
    	}
    }
    @Test
    public void testValidHospitaldistrict() {
    	Assertions.assertTrue(HospitalValidator.Hospitaldistrict("chennai"));
    }
    @Test
    
    public void testInvalidHospitalDistrict() {
    	try {
        Hospital hospital = new Hospital();
        hospital.setName("ABC Hospital");
        hospital.setAddress("123 Main Street");
        hospital.setdistrict("");
        HospitalValidator.validate(hospital);
    }
    	catch(IllegalArgumentException e) {
    		Assertions.assertEquals("Hospital district " + "be empty or null",e.getMessage());
    	}
    }
    @Test
    public void testValidHospitalpincode() {
    	Assertions.assertTrue(HospitalValidator.Hospitalpincode(600066));
    }
    @Test
   
    public void testInvalidHospitalPincode() {
    	try {
        Hospital hospital = new Hospital();
        hospital.setName("ABC Hospital");
        hospital.setAddress("123 Main Street");
        hospital.setdistrict("XYZ District");
        hospital.setpincode(134); // Invalid pincode
        HospitalValidator.validate(hospital);
    	}
        catch(IllegalArgumentException e) {
    		Assertions.assertEquals("pincode is not valid",e.getMessage());
    	}
    	
    }
    @Test
    public void testValidHospitalEmail() {
    	Assertions.assertTrue(HospitalValidator.HospitalEmail("kingston@gmail.com"));
    }

    @Test
    
    public void testInvalidHospitalEmail() {
    	try {
        Hospital hospital = new Hospital();
        hospital.setName("ABC Hospital");
        hospital.setAddress("123 Main Street");
        hospital.setdistrict("XYZ District");
        hospital.setpincode(1345);
        hospital.setemailId("invalid_email"); // Invalid email format
        HospitalValidator.validate(hospital);
    }
    	 catch(IllegalArgumentException e) {
     		Assertions.assertEquals("The email address is: Invalid",e.getMessage());
     	}
    }
    @Test
    public void testValidHospitalLicense() {
    	Assertions.assertTrue(HospitalValidator.HospitalLicense("1234567456"));
    }
    @Test
   
    public void testInvalidHospitalLicense() {
    	try {
        Hospital hospital = new Hospital();
        hospital.setName("ABC Hospital");
        hospital.setAddress("123 Main Street");
        hospital.setdistrict("XYZ District");
        hospital.setpincode(12345);
        hospital.setemailId("abc@example.com");
        hospital.setlicense("ABC"); // Invalid license length
        HospitalValidator.validate(hospital);
    	}
    	 catch(IllegalArgumentException e) {
      		Assertions.assertEquals("Hospital License " + "be empty or null",e.getMessage());
      	}
    }
}
