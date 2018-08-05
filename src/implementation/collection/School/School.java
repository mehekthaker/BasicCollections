/*Set: Observe that Set doesn’t accept duplicate objects.
For each above object, override equals() and hashCode() methods and define the equality. Please see the criteria below. 
Create few equal objects (based on the below criteria) and add them to HashSet and observe the fact 
that Set doesn’t accept duplicates (through equals() and hashCode()).
School : name, city and school district together define equality*/

package implementation.collection.School;

public class School {

	private String name;
	private String city;
	private String schoolDistrict;
	private String greatSchoolRanking;
	
	
	public School(String name, String city, String schoolDistrict, String greatSchoolRanking) {
		this.name=name;
		this.city=city;
		this.schoolDistrict=schoolDistrict;
		this.greatSchoolRanking=greatSchoolRanking;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schoolDistrict == null) ? 0 : schoolDistrict.hashCode());
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
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolDistrict == null) {
			if (other.schoolDistrict != null)
				return false;
		} else if (!schoolDistrict.equals(other.schoolDistrict))
			return false;
		return true;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getSchoolDistrict() {
		return schoolDistrict;
	}
	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}
	
	
	public String getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(String greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	@Override
	public String toString() 
	{
		return "School [name= "+getName()+", city= "+getCity()+", schoolDistrict= "+getSchoolDistrict()+", great school ranking= "+getGreatSchoolRanking()+"]";
	}	
	
	
}
