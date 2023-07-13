package com.fssa.kingston.kingston.sampleprogram.day21.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.kingston.sampleprogram.day21.practice.Hospital;
import com.fssa.kingston.sampleprogram.day21.practice.HospitalValidator;


public class TestHospitalValidator {
	@Test
	public void testValidate() {
		Hospital hospital = getHospital();
		Assertions.assertTrue(HospitalValidator.validate(hospital));
	}
	@Test
	public void testInvalidName() {
		Hospital hospital = getHospital();
		try {
			hospital.hospitalName = "asdfg";
			HospitalValidator.validate(hospital);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name cannot be empty or null",
					ex.getMessage());
			
		}
	}
	public Hospital getHospital() {
		Hospital hospital = new Hospital();
		hospital.hospitalName = "k";
	    hospital.hospitalAddress="a";
	    hospital.district="a";
	    hospital.pincode=123456;
	    hospital.emailId="asdf@.com";
		return hospital;
	}
}
