/*Set: Observe that Set doesn’t accept duplicate objects.
For each above object, override equals() and hashCode() methods and define the equality. Please see the criteria below. 
Create few equal objects (based on the below criteria) and add them to HashSet and observe the fact that Set doesn’t accept duplicates 
(through equals() and hashCode()).
CellPhone : company, model and operatingSstem together define equality*/

package implementation.collection.CellPhone;

public class CellPhone {

	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;
	
	
	public CellPhone(String company, String model, String description, String operatingSystem, double price) {
		this.company=company;
		this.model=model;
		this.description=description;
		this.operatingSystem=operatingSystem;
		this.price=price;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
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
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		return true;
	}


	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
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
		return "Cellphone [company= "+getModel()+", model= "+getModel()+", description= "+getDescription()+", Operating System= "+getOperatingSystem()+", price= "+getPrice()+"]";
	}
	
	
}
