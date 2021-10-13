import java.util.Scanner;

public class E_Bill 
{
	// Code of Question No - 10
	// Generating Electricity Bill 
	
	public static void main(String[] args) 
	{
		System.out.println("Enter unit of Electricity Consumed : \n ");
		Scanner sc = new Scanner(System.in);
		int unit = sc.nextInt();     				//User Input
		if (unit <= 100)							// lees than 100 unit
		{
			double Bill = unit * 1.20;
			System.out.print("Charges on Electricity Bill is : " + Bill);
		}
		else if( unit <= 200 && unit > 100 )		// More than 100 and less than 200 unit
		{
			double Bill = (100* 1.20) + ((unit -100)* 2.00);
			System.out.print("Charges on Electricity Bill is : " + Bill);
		}
		else if (unit <= 300 && unit > 200)			// More than 200 and less than 300 unit
		{
			double Bill = (100* 1.20) + (100 * 2.00) + ((unit -200) * 3.00);
			System.out.print("Charges on Electricity Bill is : " + Bill);
		}
		else if( unit > 300 )						// More than 300 unit
		{
			double Bill = (100* 1.20) + (100 * 2.00) + (100 * 3.00) + ((unit -300) * 5.00);
			System.out.print("Charges on Electricity Bill is : " + Bill);
		}
		sc.close();
	}
}
