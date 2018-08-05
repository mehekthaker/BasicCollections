/*Set: Observe that Set doesn’t accept duplicate objects.
For each above object, override equals() and hashCode() methods and define the equality. Please see the criteria below. 
Create few equal objects (based on the below criteria) and add them to HashSet and observe the fact that Set doesn’t accept duplicates 
(through equals() and hashCode()).
Car : make and model together define equality*/

package implementation.collection.Car;

public class Car implements Comparable<Car>{
	
	private String model;
	private double price;
	private int year;
	private String make;
	
	public Car(String model, double price, int year, String make)
	{
		this.model=model;
		this.price=price;
		this.year=year;
		this.make=make;
	}
	
	
	@Override
	public int compareTo(Car car) {
		

				return this.getMake().compareTo(car.getMake());

	}	
	
			
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}


		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		
		
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		
		@Override
		public String toString() 
		{
			return "Car [model= "+getModel()+", price= "+getPrice()+", year= "+getYear()+", make= "+getMake()+"]";
		}
		
	}

