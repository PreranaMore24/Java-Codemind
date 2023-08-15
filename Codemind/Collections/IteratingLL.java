import java.util.*;
public class IteratingLL 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Krishna");
		ll.add("Rama");
		ll.add("Radhey");
		ll.add("Sita");
		ll.add("Laxman");
		System.out.println("Using Iterator:-");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println("\n\nUsing loop:-");
		for(String item : ll) 
		{
			System.out.println(item);
		}
	}

}