import java.util.*;
public class evenodd 
{
    public static void main(String arg[]) 
    {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter a Number: ");
        a = s.nextInt();
        s.close();

        if (a % 2 == 0) {
            System.out.println("Given Number "+ a + " is Even");
        } else {
            System.out.println("Given Number " + a + " is Odd");
        }

    }

}