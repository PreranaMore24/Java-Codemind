public class SecondLargestInArray
{  
public static void main(String args[])
{  
int a[]={25,10,35,15,45}; 
int temp; 
int total=a.length; 
System.out.println();
System.out.print("Elements of Array are : ");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
         int second= a[total-2];  
System.out.println();
System.out.println("Second Largest Element in given Array is : "+second);  
System.out.println();
}
} 