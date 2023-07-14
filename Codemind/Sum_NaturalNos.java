import java.util.Scanner;
public class Sum_NaturalNos
{
    void Sum(int num)
    {
        int res=0;
        for(int i=1;i<=num;i++)
        {
            res+=i;
        }
        System.out.println("Addition of Natural Numbers are = "+res);
    }
    public static void main(String[] args) 
    {
        Sum_NaturalNos s = new Sum_NaturalNos();
        System.out.println("Enter Any Number = ");
        Scanner sc =new Scanner(System.in);
        int val = sc.nextInt();
        s.Sum(val);
        sc.close();
    }
}