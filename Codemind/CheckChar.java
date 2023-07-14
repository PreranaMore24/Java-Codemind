import java.util.*;
public class CheckChar
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        char ch =sc.next().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println("Entered character is in LOWERCASE");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Entered character is in UPPERCASE");
        }
        else
        {
            System.out.println("Enter a VALID character");
        }
        System.out.println();
        sc.close();
    }
}