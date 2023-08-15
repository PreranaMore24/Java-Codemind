import java.util.*;
public class ALCopyToString 
{
	public static void main(String[] args) 
	{
		ArrayList<String> main = new ArrayList<>();
		main.add("krishna");
		main.add("rama");
		main.add("raghav");
		main.add("hari");
		main.add("kisna");
		main.add("Radhe");
		main.add("laxmi");
		System.out.println("Items in MAIN list are:-"+main);
		ArrayList<String> copiedList = new ArrayList<>();
		for(String item : main) 
        {
			copiedList.add(item);
		}
		System.out.println("Items are copied in copiedList:-"+copiedList);
	}

}