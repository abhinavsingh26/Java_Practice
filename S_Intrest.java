import java.util.Scanner;

public class S_Intrest 
{

	public static void main(String[] args) 
	{
		System.out.println("This is program of generating intrest on principle amount : "  );
		
		System.out.println("Enter your principle amount : ");
		Scanner sc = new Scanner(System.in);
		float pri = sc.nextInt();    // User principle amount                                     
		System.out.println("Enter your Rate of Intrest :");
		float rate = sc.nextInt();    // User rate of interest
		System.out.println("Enter your time of investment");
		float time = sc.nextInt();		// User time of investment
		float SI = (pri * rate * time) / 100 ;
		System.out.println( SI );   // Error while entering float number
		sc.close();
	}

}
