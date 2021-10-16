import java.util.Scanner;

public class Sum_Number 
{
	// Code of Question No - 2
	//Addition of given numbers
	
	public static void main(String[] args) 
	{
		int Num1, Num2, Addition; //Declaring Variables
		System.out.println("This is program of given two number: \n"  );
		
		System.out.println("Enter your First Number");
		Scanner sc = new Scanner(System.in);
		Num1 = sc.nextInt();    // Taking User input first number                                     
		System.out.println("Enter your Second Number");
		Num2 = sc.nextInt();    // Taking User input Second number
		
		sc.close();
		
		System.out.println("Addition of Two Number is : ");
		Addition = ( Num1 + Num2 ); // Adding two number here
		System.out.println( Addition ); 
	}

}
