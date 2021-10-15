import java.util.Scanner;

public class Even_Odd 
{
	// Code of Question No - 4
	//Detecting Even/ Odd numbers
	
	public static void main(String[] args) 
	{
		System.out.println("This is program to detect Odd and Even number: \n"  );
		
		System.out.println("Enter your number : ");
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();						//Taking User Input
		Number = Number % 2;							//If remainder is zero then even else zero
		if(Number == 0)
		{
			System.out.println("Your number is Even");	
		}
		else
			System.out.println("Your number is Odd");
		sc.close();
	}

}
