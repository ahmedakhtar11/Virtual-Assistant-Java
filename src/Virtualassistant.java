// Ahmed Akhtar
// Java Virtual Assistant
// Note: Still in Construction
// Example Inputs: hello, goodbye, date


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
        static void get_Date_and_Time()
        {
            Calendar calender=Calendar.getInstance();
            Date date=calender.getTime();
            System.out.println("Current Date and Time is:-");
            System.out.println(date.toLocaleString());
        }


        public static void main(String[] args)

        {

// Setting up Input
            Scanner myVar = new Scanner(System.in);


// Putting Input into String
// Alternative: myVar.nextLine();
            String entry = myVar.next();

            switch(entry) {

                case "hello":
                    Greeting();
                    break;

                case "goodbye":
                    Goodbye();
                    break;

                default:
                    System.out.println("I'm very sorry there. I do not seem to Understand.");

            }

        }
    }

/*
//If Else Statement Usage
// General Answers
if (entry.equals("hello")) {
	Greeting();
}
else if (entry.equals("goodbye")) {
	Goodbye();
}
 else {
	 System.out.println("I'm very sorry there. I do not seem to Understand.");
 }
*/

