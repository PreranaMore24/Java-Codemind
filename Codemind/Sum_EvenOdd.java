import java.util.*;
class Sum_EvenOdd
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.print("Enter the elements of an array :");
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = sc.nextInt();
        }

        int Even_sum = 0;
        int Odd_sum = 0;

        for (int num : a) 
        {
            if (num % 2 == 0) 
            {
                Even_sum += num;
            } 
            else 
            {
                Odd_sum += num;
            }
        }
        System.out.println("Addition of Even numbers from given array is : " + Even_sum);
        System.out.println("Addition of Odd numbers from given array is : " + Odd_sum);
    }

}