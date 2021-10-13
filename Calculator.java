import java.util.Scanner;

public class Calculator 
{
	// Code of Question No - 10
	
	public static void main(String[] args) 
	{
		int option;
	    Double num1, num2, result;

	    Scanner sc = new Scanner(System.in);		// create an object of Scanner class
	    
	    System.out.println("Choose option: \n 1 for Addition, \n 2 for Subtraction , \n 3 for Multiplication, \n 4 for division");
	    option = sc.next().charAt(0);				//  users input

	    System.out.println("Enter first number");	//  users input
	    num1 = sc.nextDouble();

	    System.out.println("Enter second number");	//  users input
	    num2 = sc.nextDouble();

	    switch (option) 
	    {
	      case '1':
	        result = num1 + num2;					// addition between numbers
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      case '2':
	        result = num1 - num2;					// subtraction between numbers
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      
	      case '3':
	        result = num1 * num2;					// multiplication between numbers
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      
	      case '4':
	        result = num1 / num2;					// division between numbers
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid option!");
	        break;
	    }

	    sc.close();
	}

}
