// import java.util.*;
class ArrayExample 
{
        public static void main(String args[]) 
        {
        int arr[] = { 19, 24, 85, 40, 15, 60, 75, 80, 99 };
        int min = arr[0];
        int max = arr[0];
        System.out.println("Elements of Array are as follows : ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
        System.out.println("***************************************************");
        System.out.println("Printing Alternate Elements of Array :");
        for (int i = 0; i < arr.length; i += 2) 
        {
            System.out.println(arr[i]);
        }
        System.out.println("***************************************************");
        System.out.println("Number of Elements in Array :" + arr.length);
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] < min) 
            {
                min = arr[i];
            }
        }
        System.out.println("Smallest Elements present in the Array is :" + min);
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        System.out.println("Largest Elements in Array :" + max);
        System.out.println();
        System.out.println();
    }
}