// Ahmed Akhtar
// Java Virtual Assistant

// Example Inputs:
//Greeting: Type Hello, Hi
//Goodbye: Type bye or farewell
//Date and Time: Type date
//Calculator: Type 1+1
//Fortune: Type fortune or cookie

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


//Java Class and Method
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


//Fortune Cookie Class and Method
public class FortuneCookie {
	private List<String> answers;
	
	public FortuneCookie() {
		this.answers = Arrays.asList("Trouble will be unavoidable.", "You will either suffer the pain of discipline or the pain of regret.", "Luck be a lady.", "Good News will reveal itself.", "You have nothing to worry about.", "Find the Timekeeper.", "You will win your next battle.");
	}
	
	public String FortuneCookieAnswers() {
		Random answer = new Random();
//Random answer between 1-10
		int fortuneanswer = answer.nextInt(10);
		return answers.get(fortuneanswer);
	}
}


public class Virtualassistant {

// Creating Method (Called Later)
static void greeting() {
		System.out.println("Hello I am Oracle, your Virtual Assistant.");
	 }
	 
static void goodbye() {
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
			 //Main Code

// Setting up Input
Scanner myVar = new Scanner(System.in);


// Putting Input into String
// Alternative: myVar.nextLine();
String entry = myVar.next();
 
 
//Basic Regex Matching
if (entry.matches("(hi|hello|yo|wassup|whats up|good morning|Hello|Hi|good afternoon|how are you|howdy)\\b.*")) {
greeting();

}

else if (entry.matches("(peace|bye|Bye|adios|farewell|good night|goodnight)\\b.*")) {
goodbye();
	
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

//Under Construction
else if (entry.matches("(fortune|cookie|Fortune|Cookie)\\b.*")) {
		

FortuneCookie afortunecookie = new FortuneCookie();
			System.out.println(afortunecookie.FortuneCookieAnswers());

}

//Default
else {
System.out.println("I'm sorry I do not understand");

	  }
   }
}
