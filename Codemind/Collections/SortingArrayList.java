
import java.util.*;
public class SortingArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(5);
		al.add(10);
		al.add(11);
		al.add(1);
		al.add(7);
		System.out.println("Befor sorting : "+al);
		Collections.sort(al);
		System.out.println("After sorting : "+al);
	}

}