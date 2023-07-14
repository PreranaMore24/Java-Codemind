public class CalPower
{
    void calPower(int base , int expo)
    {
        int res=1;
        while(expo !=0)
        {
            res=res*base;
            expo--;
        }
    System.out.println("Result = "+res);
    }
    public static void main(String[] args) 
    {
        CalPower c = new CalPower();
        int base=3;
        int expo=4;
        c.calPower(base,expo);
        
    }
}