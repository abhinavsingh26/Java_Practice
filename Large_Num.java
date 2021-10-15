import java.util.Scanner;

public class Large_Num 
{
	// Code of Question No - 9
	// Comparing 3 Numbers
	
	public static void main(String[] args) 
	{
		System.out.println("Enter numbers to compare largest : \n ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();				// User Input 1
		int num2 = sc.nextInt();				// User Input 2
		int num3 = sc.nextInt();				// User Input 3
		if (num1 >= num2 && num1 >= num3)		//comparing numbers, num1 with num2 and num1 with num3   
		{
			System.out.println(num1 + " is Largest");//if both conditions are true, prints num1
		}
		else if(num2 >= num1 && num2 >= num3 )	//comparing num2 with num1 and num2 with num1  
		{
			System.out.println(num2 + " is Largest");//if both conditions are true, prints num2
		}
		else
			System.out.println(num3 + " is Largest");//prints num3 if the above conditions are false 
		
		sc.close();
	}

}
