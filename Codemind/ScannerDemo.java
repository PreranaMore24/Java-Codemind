import java.util.*;
class ScannerDemo
{
   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b,res;
        System.out.println("Enter First NUmber");
        a=sc.nextInt();
        System.out.println("Enter Second NUmber");
        b=sc.nextInt();
        res=a+b;
        System.out.println("Addition of two Integers is : "+res);

        float c,d,res1;
        System.out.println("Enter First NUmber");
        c=sc.nextFloat();
        System.out.println("Enter Second NUmber");
        d=sc.nextFloat();
        res1=c-d;
        System.out.println("Difference of two Floating Numbers is : "+res1);

        int e,f,res3;
        System.out.println("Enter First NUmber");
        e=sc.nextInt();
        System.out.println("Enter Second NUmber");
        f=sc.nextInt();
        res3=e*f;
        System.out.println("Product of two Integers is : "+res3);

        int g,h,res4;
        System.out.println("Enter First NUmber");
        g=sc.nextInt();
        System.out.println("Enter Second NUmber");
        h=sc.nextInt();
        res4=g/h;
        System.out.println("Division of two Integers is : "+res4);
        sc.close();
    }
}