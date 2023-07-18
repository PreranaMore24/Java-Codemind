import java.util.Arrays;
import java.util.Scanner;

public class Sum_TwoArrays 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Size of two Arrays should be same !");
        System.out.print("Enter any size for two Array: ");
		int n = sc.nextInt();

		int arr1[] = new int[n];
		int arr2[] = new int[n];

        System.out.print("Enter elements of the Array1: ");
		for (int i = 0; i < n; i++) 
		{
			arr1[i] = sc.nextInt();
		}

        System.out.print("Enter elements of the Array2: ");
		for (int i = 0; i < n; i++) 
		{
			arr2[i] = sc.nextInt();
		}

		
		int arr3[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) 
		{
			arr3[i] = arr1[i] + arr2[i];
		}
        System.out.print("Sum of Two Arrays is : ");
        for (int i = 0; i < arr3.length; i++) 
        {
            System.out.print(arr3[i] + " " );
        }

	}

}