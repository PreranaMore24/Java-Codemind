import java.util.*;

public class SortDescArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(41);
		al.add(16);
		al.add(85);
		al.add(1);
		al.add(12);
		al.add(111);
		al.add(73);
		
		al.sort(Collections.reverseOrder());
		System.out.println(al);
	}

}