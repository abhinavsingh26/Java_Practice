import java.util.Scanner;

public class Num_Pyramid 
{
	// Code of Question No - 7
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("This is program of to print pyramid number pattern : \n ");
        System.out.println("How many rows you want in your pyramid ? \n");
 
        int NoOfRows = sc.nextInt();					//Taking noOfRows value from the user
 
        int rowCount = 1;
 
        System.out.println("Here Is Your Pyramid : \n");
 
        for (int i = NoOfRows; i > 0; i--)
        {
            
            for (int j = 1; j <= i*2; j++)				//Printing i*2 spaces at the beginning of each row
            {
                System.out.print(" ");
            }
 
            for (int j = 1; j <= rowCount; j++)          //Printing j value where j value will be from 1 to rowCount
            {
                System.out.print(j+" ");
            }
             
            for (int j = rowCount-1; j >= 1; j--)		//Printing j value where j value will be from rowCount-1 to 1
            {               
                System.out.print(j+" ");            
            }                       
             
            System.out.println();
 
            rowCount++;
        }
        sc.close();
	}

}
