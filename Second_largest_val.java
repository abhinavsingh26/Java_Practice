import java.util.*;

public class Second_largest_val 
{	
	// Code of question no 15
	// Printing second largest element
	
	static void p2largest(int arr[],int arr_size)
	{
		int i ;
	 
		// Atleast two elements should be there
		if (arr_size < 2)
		{
			System.out.printf(" Array Size is Insufficient. ");
			return;
		}
	 
		
		Arrays.sort(arr);							// Sort the array
	 
		
		for (i = arr_size - 2; i >= 0; i--)			// Start from second last element as the largest element is at last
		{										
			if (arr[i] != arr[arr_size - 1])		// If the element is not equal to largest element
			{
				System.out.printf("The second largest element is : %d\n", arr[i]);
	      return;
	    }
	}
	 
	  System.out.printf("There is no second largest element. \n");
	}
	 
	public static void main(String[] args)
	{
	  int arr[] = {12, 35, 1, 10, 34, 1};
	  int n = arr.length;
	  p2largest(arr, n);
	}
}
