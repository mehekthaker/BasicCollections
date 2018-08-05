/*LinkedHashSet : Add all the names of our class students randomly to a LinkedHashSet, 
iterate through them and print. Observe that LinkedHashSet is maintaining the order that you add.*/

package implementation.collection;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String args[]) {

		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();

		linkedhashset.add("Ryan");
		linkedhashset.add("John");
		linkedhashset.add("Anna");
		linkedhashset.add("Emma");
		linkedhashset.add("Taylor");

		linkedhashset.stream().forEach((name) -> System.out.println(name));
	}
}
