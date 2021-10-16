
public class Sum_Val_Array 
{
	// Code of question No-12
	
	public static void main(String[] args) 
	{
		int  arr[] ={1, 10, 3, 4, 5};  
        int sum = 0;  
        
        //Loop through the array to calculate sum of elements  
        
        for (int i = 0; i < arr.length; i++) 
        {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum value of an array is : " + sum);



	}

}
