/*TreeSet : Add all the names of our class students randomly to a TreeSet, iterate through them and print. 
Observe that TreeSet keeps these elements in a natural order.*/

package implementation.collection;

import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String args[]) 
	{
		TreeSet<String> treeset = new TreeSet<>();
		
		treeset.add("Ryan");
		treeset.add("John");
		treeset.add("Anna");
		treeset.add("Emma");
		treeset.add("Jake");
		
		treeset.stream().forEach((name) -> System.out.println(name));
		
	}

}
