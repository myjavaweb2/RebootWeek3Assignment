// Author - Kamaldeen Alabi
// A List of Countries App Assignment
// SSA - The Iron Yard Boot Camp
// August 16, 2016

package com.ssa.reboot.week3.day1;

import com.ssa.reboot.week3.day1.ReadWriteCountries;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		String userInput = null;
		String userInputIsValid = null;
		Scanner sc = new Scanner(System.in);
		boolean userContinue = true;
		ArrayList<String> fileData = null;

		ReadWriteCountries ourCountryList = new ReadWriteCountries();

		do {

			System.out.println();
			System.out.println("Please make a selection: ");
			System.out.println();
			System.out.println("Enter 1 to display a list of countries.");
			System.out.println("Enter 2 to add a country to the file.");
			System.out.println("Enter 3 to delete a country from the file");
			System.out.println("Enter 4 to exit the app.");

			userInput = sc.nextLine();
			userInputIsValid = ValidatorCountry.Validator(userInput);

			if (userInput.equalsIgnoreCase("1")) {

				System.out.println();
				fileData = ourCountryList.readMethod();

				// print out list of countries from file
				for (String x : fileData) {
					System.out.println(x);
				}

			} else if (userInput.equalsIgnoreCase("2")) {

				System.out.println();
				System.out.println("Please type the name of the country you would like to add: ");
				userInput = sc.nextLine();

				ourCountryList.writeMethod(userInput);

			} else if (userInput.equalsIgnoreCase("3")) {

				System.out.println();
				System.out.println(
						"Please select the number below that corresponds to the country you would like to delete: ");
				System.out.println();

				fileData = ourCountryList.readMethod();

				for (int x = 1; x < fileData.size(); x++) {
					System.out.println(x + ". " + fileData.get(x));
				}
				userInput = sc.nextLine();
				int countryToDeleteNumber = Integer.parseInt(userInput);

				fileData.remove(countryToDeleteNumber);

				// persist to file
				ReadWriteCountries.writeMethodToArrayList(fileData);

			} else if (userInput.equalsIgnoreCase("4")) {

				System.out.println();
				System.out.println("Good bye! We're sorry you choose to exit the app.");

				userContinue = false;
			}

		} while (userContinue);

		// commented out portion of code used for Adventurer mode before
		// proceeding to Epic mode above. Instead of users typing in the name
		// of the country they want to delete, they just need to select
		// the number that corresponds to the list of countries are presented.
		//
		// } else if (userInput.equalsIgnoreCase("3")) {
		//
		// System.out.println("Please type the name of the country you would
		// like to delete: ");
		// userInput = sc.nextLine();
		//
		// String countryToDelete = userInput.toLowerCase();
		//
		// fileData = ourCountryList.readMethod();
		//
		// for(int i = 0; i< fileData.size(); i++){
		// if(fileData.get(i).toLowerCase().equals(countryToDelete)){
		// fileData.remove(i);
		// }
		// }
		//
		// // persist to file
		// ReadWriteCountries.writeMethodToArrayList(fileData);
		//
		// } else if (userInput.equalsIgnoreCase("4")) {

	}// main

}// class
