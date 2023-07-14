import java.util.*;
public class Grading
{
    void grades(int marks)
    {
        if(marks>80)
        {
            System.out.println("Grade you've  got = A ");
        }
        else if(marks>60 && marks<=80)
        {
            System.out.println("Grade you've  got = B ");
        }
        else if(marks >50 && marks<=60)
        {
            System.out.println("Grade you've  got = C ");
        }
        else if(marks>45 && marks<=50)
        {
            System.out.println("Grade you've  got = D ");
        }
        else if(marks>25 && marks<=45)
        {
            System.out.println("Grade you've  got = E ");
        }
        else
        {
            System.out.println("Grade you've got = F");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks : ");
        int marks=sc.nextInt();
        Grading g = new Grading();
        g.grades(marks);
        sc.close();
    }
}