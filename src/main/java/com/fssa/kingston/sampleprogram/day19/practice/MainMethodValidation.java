package com.fssa.kingston.sampleprogram.day19.practice;

public class MainMethodValidation {

		public static void main(String[] args) {
			ValidationMethod user = new ValidationMethod();

			user.setId(90);
			user.setName("kingston");
			user.setEmail("kingston@gmail.com");
			user.setPassword("kingston123@A");

			try {
				user.validate(user);
				System.out.println("User Id: " + user.getId());
				System.out.println("User Name: " + user.getName());
				System.out.println("User Email: " + user.getEmail());
				System.out.println("User Password: " + user.getPassword());
				System.out.println("User is valid.");
			}

			catch (IllegalArgumentException e) {
				System.out.println("User validation failed: " + e.getMessage());
			}
		}

	}
