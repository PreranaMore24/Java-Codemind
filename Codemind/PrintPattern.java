public class PrintPattern
{
    void printPattern(int row)
    {
        System.out.println("Printing star Pattern : ");
        for(int i =1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void reverse(int row)
    {
        System.out.println("Printing star pattern in Reverse Order");
        for(int i =row;i>=1;i--)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int row=7;
        PrintPattern p = new PrintPattern();
        p.printPattern(row);
        p.reverse(row);
        
    }
}