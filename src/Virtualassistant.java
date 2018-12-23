// Ahmed Akhtar
// Java Virtual Assistant
// Note: Still in Construction
// Example Inputs: hello, goodbye, date



public class Calculator {
	
	public double calculate(int first, int second, String operator) {
		if (operator.equals("+")) {
			return 1.0 * first + second;
		} else if (operator.equals("-")) {
			return 1.0 * first - second;
		} else if (operator.equals("*")) {
			return 1.0 * first * second;
		} else if (operator.equals("/")) {
			return 1.0 * first / second;
		}
	return 0.0;
	}
}

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Virtualassistant {

// Creating Method (Called Later)
static void Greeting() {
		System.out.println("Hello I am Oracle, your Virtual Assistant.");
	 }
	 
static void Goodbye() {
	System.out.println("See you Later. We shall be reunited one day.");
}

// Getting Date and Time
static void date_and_time()
	{
Calendar calender=Calendar.getInstance();
Date date=calender.getTime();
System.out.println("Current Date and Time is:");
		System.out.println(date.toLocaleString());
	}


public static void main(String[] args) 

{

// Setting up Input
Scanner myVar = new Scanner(System.in);


// Putting Input into String
// Alternative: myVar.nextLine();
String entry = myVar.next();
 
 
//Basic Regex Matching
if (entry.matches("(hi|hello|yo|wassup|whats up|good morning|Hello|Hi|good afternoon|how are you|howdy)\\b.*")) {
System.out.println("whats up doc?");

}

else if (entry.matches("(peace|bye|Bye|adios|farewell|good night|goodnight)\\b.*")) {
System.out.println("Goodbye then");
	
}

else if (entry.matches("(?s).*(\\b[0-9]*)(\\s)?([-|+|*|/])(\\s)?([0-9]*).*")) {
System.out.println("Calculator Initialized!");
Calculator calculator = new Calculator();
			int firstNumber = 0;
			int secondNumber = 0;
			String firstString = "";
			String secondString = "";
			String operator = "";
			int overallIndex = 0;
			
for (int index = 0; index < entry.length(); index++) {
				String chaString = Character.toString(entry.charAt(index));
			
			
if (chaString.matches("[-|+|*|/]")) {
					operator += chaString;
					overallIndex = index;
					break;
				}
				if (chaString.matches("[0-9]")) {
					firstString += chaString;
				}
			}
			
			for (int index = overallIndex + 1; index < entry.length(); index++) {
				String chaString = Character.toString(entry.charAt(index));
				if (chaString.matches("[0-9]")) {
					secondString += chaString;
				}
			}
			
			
			if (!(firstString.isEmpty())) {
				firstNumber = Integer.parseInt(firstString);
			}
			if (!(secondString.isEmpty())) {
				secondNumber = Integer.parseInt(secondString);
			}
			
			
			double calculation = calculator.calculate(firstNumber, secondNumber, operator);
			if ((calculation % 1) == 0) {
				int intCalculation = (int)calculation;
				System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + intCalculation);

} 
}

//Default
else {
System.out.println("I'm sorry I do not understand");

       }
   }
}
