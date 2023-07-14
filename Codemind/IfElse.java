import java.util.*;
class IfElse
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        sc.close();
        boolean res=age>18;
        if (res)
        {
            System.out.println("You are ELIGIBLE for voting !!");
        }
        else
        {
            System.out.println("You are NOT ELIGIBLE for voting !!");
        }
        System.out.println("Result = "+res);
    }
}