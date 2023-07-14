import java.util.*;
public class GreatestNum
{
    void greatestNum(int a ,int b)
    {
        if(a>b)
        {
            System.out.println("Greater Number = "+a);
        }
        else
        {
            System.out.println("Greater Number = "+b);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a =sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b=sc.nextInt();
        GreatestNum g = new GreatestNum();
        g.greatestNum(a,b);
        sc.close();

    }
}