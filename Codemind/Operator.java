class Operator
{
    public static void main(String[] args) 
    {
        System.out.println("\n** Arithemetic Operator's **");
        int a=10,b=90;
        System.out.println("a = "+a + " ,b = "+b);
        int res=a+b;
        System.out.println("Addition   = "+res);
        int res1=a-b;
        System.out.println("Difference = "+res1);
        int res2=a*b;
        System.out.println("Product    = "+res2);
        int res3=b/a;
        System.out.println("Division   = "+res3);
        int res4=b%a;
        System.out.println("Modulus    = "+res4);

        System.out.println("\n** Logical Operator's **");
        boolean x= true;
        boolean y= true;
        boolean r =(x && y);
        boolean r1=(x || y);
        System.out.println(" x && y = "+r);
        System.out.println(" x || y = "+r1);

        System.out.println("\n** Comparison Operators **" );
        int p =10,q=20;
        boolean equalres=(p==q);
        System.out.println(" p == q  : "+equalres);
        boolean equalres1=(p>q);
        System.out.println(" p > q   : "+equalres1);
        boolean equalres2=(p<q);
        System.out.println(" p < q   : "+equalres2);
        boolean equalres3=(p!=q);
        System.out.println(" p != q  : "+equalres3);

        System.out.println("\n** Increment and Decrement **");
        int e=5;
        System.out.println("e   = "+e);
        e++;
        System.out.println("e++ = "+e);
        e--;
        System.out.println("e-- = "+e);

        System.out.println("\n** Bitwise Operators **" );
        int f=5,g=5;
        int v1 = f & g;
        int v2 = f | g;
        System.out.println("f & g = "+v1);
        System.out.println("f | g = "+v2);

        System.out.println("\n** Ternary Operators **");
        int val3 =(f>g) ? 10:30;
        System.out.println("Ternary Operator Condition : "+val3);
        }
}