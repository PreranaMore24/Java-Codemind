import java.util.*;
public class ReverseOrderLL 
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
		Iterator<String> itr = ll.descendingIterator();
		while(itr.hasNext()) 
        {
			System.out.println(itr.next());
		}
		
	}

}
