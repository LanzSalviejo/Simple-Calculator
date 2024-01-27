/* Purpose:
 * 		Program that will act as a simple calculator and perform basic mathematical functions between two numbers and display the result
 * Programmer: Lanz Salviejo
 * Date: Jan 2024
 */

// Imports scanner function
import java.util.*;

public class SimpleCalculator {

	public static void main(String[] args) {
		// Welcomes user and describes program
		System.out.println("Welcome to the Simple Calculator!!!");
		System.out.println("\nThis program evaluates a simple mathematical expression");
		System.out.println("input by the user and outputs the result. When prompted,");
		System.out.println("The user should input a number, followed by an operator,");
		System.out.println("folowed by a second number. A space must seperate the");
		System.out.println("numbers and the mathematical operator.");
		System.out.println("Lets get started!");
		
		// Initializes scanner function
		Scanner input = new Scanner(System.in);
		
		// States the variables used for calculations
		double number1, number2, result;
		char operator;
		
		// Variable that asks user if they would like to input another expression
		char ans = 'y'; 
		
		do {
			// Program segment that takes the users input
			System.out.print("\nEnter a methematical expression: ");
			number1 = input.nextDouble();
			operator = input.next().charAt(0);
			number2 = input.nextDouble();
			
			// Program segment that converts the users input a proper mathematical equation
			switch (operator) {
			
				// Cases for multiplication, case * and x do not need to be specified as it will automatically go down to case X
            	case '*': 
            	case 'x': 
            	case 'X':
                    	result = number1 * number2;
                    	// Prints result using printf form, each specifier indicates for each variable in order
                    	System.out.printf("	%.2f %c %.2f = %.2f",  number1, operator, number2, result);
                    	break;
                    	
                // Case for division
	            case '/':
	            		if ((number1 != 0)&&
	            			(number2 != 0)) {
		                    result = number1 / number2;
		                    System.out.printf("	%.2f %c %.2f = %.2f",  number1, operator, number2, result);
		                    break;
	            		}// if
	            		else
	            			System.out.println("\nERROR: " + number1 + " cannot be divided by " + number2);
	            			break;
	            			
	            // Case for addition
	            case '+':
	                    result = number1 + number2;
	                    System.out.printf("	%.2f %c %.2f = %.2f",  number1, operator, number2, result);
	                    break;
	                    
	            // Case for subtraction
	            case '-':
	                    result = number1 - number2;
	                    System.out.printf("	%.2f %c %.2f = %.2f",  number1, operator, number2, result);
	                    break;
	                    
	            // Case for power
	            case '^':
	            		// Calculates power using the pow method in Java's math class API
	                    result = Math.pow(number1,number2);
	                    System.out.printf("	%.2f %c %.2f = %.2f",  number1, operator, number2, result);
	                    break;
	                    
	            // Default case if the operator entered is invalid
	            default: System.out.println ("\nERROR: This expression is invalid, please try again.");
				}
			
				// Asks the user if they would like to input another calculation
				System.out.print("\nEvaluate another expression? (y/n) ");
				ans = input.next().charAt(0);
				
			} while (ans == 'y'); // Answering y will exit the loop
			
		// Closes the scanner
		input.close();
		
		// Prints out final message
		System.out.println("\nThank you for using the Simple Calculator!");
		System.out.println("Written by Lanz Salviejo, Spring 2024");
	} // main

} // SimpleCalculator
