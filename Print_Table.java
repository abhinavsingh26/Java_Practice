import java.util.Scanner;

public class Print_Table 
{
	// Code of Question No - 8
	// Printing Table of given  Number 
	
	public static void main(String[] args) 
	{
		System.out.println("Enter number of your desired table : \n ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();							// Taking user input
		for(int i = 1; i<=10; i++)
		{
			System.out.println(num + " X " + i +" = " +(i * num)); // formula and printing
		}
		sc.close();
	}

}
