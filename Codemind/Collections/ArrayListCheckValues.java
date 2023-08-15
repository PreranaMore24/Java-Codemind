import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCheckValues
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
	    al.add(48);
	    al.add(22);
	    al.add(53);
	    al.add(45);
	    al.add(100);
	    al.add(46);
	    al.add(8);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value to bes searched : ");
        int val =sc.nextInt();

		boolean isExist = al.contains(val);

		if (isExist) 
		{
			System.out.println("The element is present in the ArrayList");
		} 
		else 
		{
			System.out.println("The element isn't present in the ArrayList");
		}
	}

}