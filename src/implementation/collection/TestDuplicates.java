package implementation.collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import implementation.collection.Car.Car;
import implementation.collection.CellPhone.CellPhone;
import implementation.collection.Laptop.Laptop;
import implementation.collection.School.School;
import implementation.collection.Television.Television;

public class TestDuplicates {
	
	public static void main(String args[])
	{
		Set<Object> set = new LinkedHashSet<>();
		
		
		set.add(new Car("Figo", 300000, 1990, "Ford"));
		set.add(new Car("Baleno", 200000, 1890, "Maruti Suzuki"));
		set.add(new Car("Baleno", 600000, 1998, "Maruti Suzuki"));
		
		set.add(new CellPhone("Apple", "IPhone6", "Improved Features", "ios", 500000));
		set.add(new CellPhone("Samsumg", "J7", "Improved features", "Android", 8000000));
		set.add(new CellPhone("Apple", "IPhone6", "Improved features", "ios", 3000000));
		
		set.add(new Laptop("Dell", "Dell", "Windows", "i5"));
		set.add(new Laptop("lenovo", "lenovo", "Windows", "i3"));
		set.add(new Laptop("Dell", "Dell", "Linux", "i3"));
		
		
		set.add(new School("St. Anne's", "Mumbai", "Mumbai", "First"));
		set.add(new School("Mary Mculet", "Mumbai", "Mumbai", "Second"));
		set.add(new School("St. Anne's", "Mumbai", "Mumbai", "third"));
		
		set.add(new Television("Sony Bravia", "LED", true, 500000));
		set.add(new Television("Videocon", "LCD", false, 100000));
		set.add(new Television("Sony Bravia", "LED", true, 500000));
		
		
		set.stream().forEach((set1) -> System.out.println(set1));
	}

}
