class Calcinput
{
    public int addNum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public int diff(int a, int b)
    {
        int dif = a-b;
        return dif;
    }
    public int mul(int a, int b)
    {
        int pro = a*b;
        return pro;
    }
    public int div(int a, int b)
    {
        int di = a/b;
        return di;
    }
    public static void main(String args[])
    {
        int n1=40;
        int n2=20;
        Calcinput obj = new Calcinput();
        int res=obj.addNum(n1,n2);
        System.out.println("Addition : "+res);
        int res1=obj.diff(n1,n2);
        System.out.println("Difference : "+res1);
        int res2=obj.mul(n1,n2);
        System.out.println("Product : "+res2);
        int res3=obj.div(n1,n2);
        System.out.println("Division : "+res3);
    }
}