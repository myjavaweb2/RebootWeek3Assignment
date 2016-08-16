package com.ssa.reboot.week3.day1;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.ArrayList;

public class ReadWriteCountries {

	public static Path ourCountriesPath = Paths.get(
			"\\Users\\admin\\workspace\\SSARebootWeek3Assignment\\src\\com\\ssa\\reboot\\week3\\day1\\ListOfCountries.txt");
	public static File aCountryFile = ourCountriesPath.toFile();
	
	public static void writeMethod(String userInput) {

		try (PrintWriter writeCountries = new PrintWriter(new BufferedWriter(new FileWriter(aCountryFile, true)))) {
			writeCountries.println(userInput);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeMethodToArrayList(ArrayList<String> userInput) {

		try (
				PrintWriter writeCountries = new PrintWriter(new BufferedWriter(new FileWriter(aCountryFile, false)))) {
			for(String x: userInput){	
				writeCountries.println(x);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static  ArrayList<String> readMethod() {
		
		 ArrayList<String> data = new ArrayList();
		try (

				BufferedReader out = new BufferedReader(new FileReader(aCountryFile))) {

			String readingCountries;

			while ((readingCountries = out.readLine()) != null) {
				data.add(readingCountries);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return data;
	}
	
}// class
