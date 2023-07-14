import java.util.*;
public class TestPositiveNegative
{
    void test(int num)
    {
        if(num>0)
        {
            System.out.println(num+ " is a Positive Number");
        }
        else if(num== 0)
        {
            System.out.println("You Have Entered ZERO(0)");
        }
        else
        {
            System.out.println(num+" is is a Negative Number  ");

        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num=sc.nextInt();
        TestPositiveNegative t = new TestPositiveNegative();
        t.test(num);
        sc.close();
    }
}