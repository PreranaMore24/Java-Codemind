import java.util.*;
public class array8
{
    public static void main(String arg[])
    {
        int arr[][]=new int[3][3];
        int i,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 9 elements : ");
        for(i=0;i<3;i++) //for row(i)
        {
            for(j=0;j<3;j++) //for column(j)
            {
                arr[i][j]=sc.nextInt();
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }
    }
} 