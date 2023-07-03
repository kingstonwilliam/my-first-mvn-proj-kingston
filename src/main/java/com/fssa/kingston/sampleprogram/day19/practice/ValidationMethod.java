package com.fssa.kingston.sampleprogram.day19.practice;

public class ValidationMethod {

		int id;
		String name;
		String password;
		String email;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

//		validate method get user crenditals and validate using another methods
		void validate(ValidationMethod user) throws IllegalArgumentException {
			validateId(user.getId());
			validateName(user.getName());
			validateEmail(user.getEmail());
			validatePassword(user.getPassword());

		}

//		Id Validator => Id must be posituve numbers
		public static boolean  validateId(int id) throws IllegalArgumentException {
			if (id <= 0) {
				throw new IllegalArgumentException("ID should be positive.");
		
			}
			
			return true;
		}

	//   Username Validator => username length greater than 2.
		void validateName(String name) throws IllegalArgumentException {
			if (name == null || name.length() < 2) {
				throw new IllegalArgumentException("Name should have a minimum length of 2 characters.");
			}
		}

	//  email validator checks for the presence of '@' and '.' 
		void validateEmail(String email) throws IllegalArgumentException {
			String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
			boolean isMatch = email.matches(emailRegex);
			if (!isMatch) {
				throw new IllegalArgumentException("Invalid email format.");
			}
		}

	//  password validator must have 8 len, one lower, one upper, one digit and one speacial char
		void validatePassword(String password) throws IllegalArgumentException {
			String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
			boolean isMatch = password.matches(passwordRegex);
			if (!isMatch) {
				throw new IllegalArgumentException("Invalid password format.");
			}
		}

	}

