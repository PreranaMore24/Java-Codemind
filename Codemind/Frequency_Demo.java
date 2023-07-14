import java.util.*;
public class Frequency_Demo
{
public static void main(String[] args) 
{ 
    Scanner S = new Scanner(System.in);
    System.out.print("Enter elements of array: "); 
    int[] a = new int[10]; 
    for (int i = 0; i < a.length; i++) 
    { 
        a[i]= S.nextInt();
    }
    System.out.print("Enter number to find the frequency: "); 
    int number = S.nextInt();
    int frequency = 0;
    S.close();
    for (int i = 0; i < a.length; i++) 
    { 
        if (a[i] == number) 
        {
            frequency++;
        }
    }
    System.out.println("The frequency of entered number " + number + " is " + frequency);
}
}