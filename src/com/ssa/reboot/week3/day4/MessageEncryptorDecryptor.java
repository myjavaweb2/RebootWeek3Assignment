// Author: Kamaldeen Alabi
// For Week 3 - Message Encryption and Decryption Assignment
// 2016 SSA - The Iron Yard Boot Camp
//August 19, 2016

package com.ssa.reboot.week3.day4;

import java.util.HashMap;
import java.util.Scanner;

public class MessageEncryptorDecryptor {

	private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPRSTUVWXYZ!@#$%&_',. ";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInputMessage = null;

		System.out.println("Please type a message to encrypt: ");
		userInputMessage = sc.nextLine();

		System.out.println();
		System.out.println("User input message: " + userInputMessage);
		System.out.println();
//		userInputMessage = userInputMessage.toLowerCase();

		String encryptedMessage = encryptText(userInputMessage);
		System.out.println("User message encrypted: " + encryptedMessage);
		System.out.println();
		
		String decryptedMessage = decryptText(encryptedMessage);
		System.out.println("User message decrypted: " + decryptedMessage);
		System.out.println();
		
		String decryptedMessageToUpperCase = decryptedMessage.toUpperCase();

	}// main

	public static String  encryptText(String inputText) {

		HashMap<Character, Character> alphabetHashMap = new HashMap<Character, Character>();
		int shift;

		String textNumber = "";

		if (!textNumber.equals("")) {
			shift = Integer.parseInt(textNumber) % alphabet.length();
		} else {
			shift = 2;
		}

		for (int i = 0; i < alphabet.length(); i++) {

			alphabetHashMap.put(alphabet.charAt(i), alphabet.charAt((i + shift) % alphabet.length()));
		}

		String outputText = "";

		for (int j = 0; j < inputText.length(); j++) {

			outputText = outputText.concat(alphabetHashMap.get(inputText.charAt(j)).toString());
		}
		
		return outputText;
		
	}// encryptText method
	
	public static String  decryptText(String inputText) {

		HashMap<Character, Character> alphabetHashMap = new HashMap<Character, Character>();
		int shift;

		String textNumber = "";

		if (!textNumber.equals("")) {
			shift = Integer.parseInt(textNumber) % alphabet.length();
		} else {
			shift = 2;
		}

		for (int i = 0; i < alphabet.length(); i++) {

			alphabetHashMap.put(alphabet.charAt((i + shift) % alphabet.length()), alphabet.charAt(i));
		}

		String outputText = "";

		for (int j = 0; j < inputText.length(); j++) {

			outputText = outputText.concat(alphabetHashMap.get(inputText.charAt(j)).toString());
		}
		
		return outputText;
		
	}// decryptText method

}// class
