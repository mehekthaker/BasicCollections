/*TreeSet : Create few instances of Car and add them to a TreeSet. Have Car implements Comparable interface and override compareTo()
 to order them by ascending order of make of the Car. Observe the fact that you need to provide the order criteria in compareTo().*/

package implementation.collection;

import java.util.TreeSet;

import implementation.collection.Car.Car;

public class TestCarTreeSet {

	public static void main(String args[])
	{
		TreeSet<Car> treeset = new TreeSet<>();
		
		treeset.add(new Car("Benz", 600000, 1998, "Mercedes"));
		treeset.add(new Car("Figo", 300000, 1990, "Fords"));
		treeset.add(new Car("Suzuki", 200000, 1890, "Maruti"));
		
		
		treeset.stream().forEach((name) -> System.out.println(name));
		
	}
	
	
}

