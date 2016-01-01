package com.nodlee.dp.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Suger and Milk");
	}
	
	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		return answer.toLowerCase().startsWith("y");
	}
	
	public String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like milk and suger with your coffee (y/n)?");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
