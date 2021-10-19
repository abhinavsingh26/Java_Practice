
public class Max_Min_Array
{
	// Code of Question No - 13
	
	static void max(int arr[])
    {
        int max = arr[0];
        for (int i = 1 ; i< arr.length; i++)
        {
        	if (max <arr[i])
        	{
        		max= arr[i];
        	}
        }
        System.out.println(max);
    }
	
	static void min(int arr[])
    {
        int min = arr[0];
        for (int i = 1 ; i< arr.length; i++)
        {
        	if (min>arr[i])
        	{
        		min= arr[i];
        	}
        }
        System.out.println(min);
    }
    public static void main(String args[])
    {
    	int a[] = {33,44,55,34,23,43};
    	min(a);
    	max(a);
    }
}
