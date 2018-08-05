/*Set: Observe that Set doesn’t accept duplicate objects.
For each above object, override equals() and hashCode() methods and define the equality. Please see the criteria below. 
Create few equal objects (based on the below criteria) 
and add them to HashSet and observe the fact that Set doesn’t accept duplicates (through equals() and hashCode()).
Television : company, type (LCD, LED, Plasma) and price together define equality*/

package implementation.collection.Television;

public class Television {

	private String company;
	private String type;
	private boolean threedEnabled;
	private double price;
	
	
	public Television(String company, String type, boolean threedEnabled, double price) {
		this.company=company;
		this.type=type;
		this.threedEnabled=threedEnabled;
		this.price=price;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public boolean isThreedEnabled() {
		return threedEnabled;
	}
	public void setThreedEnabled(boolean threedEnabled) {
		this.threedEnabled = threedEnabled;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() 
	{
		return "Television [company= "+getCompany()+", type= "+getType()+", 3d Enabled= "+isThreedEnabled()+", price= "+getPrice()+"]";
	}
	
	
}
