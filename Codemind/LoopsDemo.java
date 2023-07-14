class LoopsDemo
{
    public static void main(String[] args) 
    {
        int i = 0;
        System.out.println("****** For ******");
        for(i=0;i<10;i++)
        {
            System.out.println(i+2);
        }
        
        System.out.println("****** While Loop ******");
        int c=5;
        while(c<=10)
        {
            System.out.println(c);
            c++;
        }
        System.out.println("****** Do While Loop ******");
        int j=5;
        do
        {
            System.out.println("Value of j = "+j);
            j++;
        }while(j<=10);
        
    }
}