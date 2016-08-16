package com.ssa.reboot.week3.day1;

public class ValidatorCountry {

	public static String Validator(String userInput) {

		if (userInput.equalsIgnoreCase("1") || userInput.equalsIgnoreCase("2") || userInput.equalsIgnoreCase("3") || userInput.equalsIgnoreCase("4")) {

		} else {
			
			System.out.println("Please enter only the numbers 1, 2, 3 or 4");

		}
		return null;
	}
}
