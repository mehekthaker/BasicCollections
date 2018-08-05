/*Map : Create a simple HashMap to store all of our class students’ names and their favorite fruits. Try to get their favorite fruit by giving their name. 
Also, list all the names and their favorite fruits using keySet() and entrySet() approaches.*/

package implementation.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	
	public static void main(String args[])
	{
		Map<String, String> map = new HashMap<>();
		
		map.put("Ryan", "Mango");
		map.put("John", "Apple");
		map.put("Anna", "Orange");
		map.put("Emma", "Pineapple");
		map.put("Jacob", "Plum");
		
		Set<Entry<String, String>> set = map.entrySet();
		
		set.stream().forEach((e) -> System.out.println(e.getKey()+" "+e.getValue()));
		
		Set<String> keyset = map.keySet();
		
		String val = map.get("Ryan");
		System.out.println(val);
		
		System.out.println("Key set values are: "+keyset);
	}

}
