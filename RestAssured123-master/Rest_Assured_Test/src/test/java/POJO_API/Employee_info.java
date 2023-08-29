package POJO_API;

import org.apache.juneau.annotation.Beanc;

public class Employee_info {
	
	private String Name;
	private int Id;
	private String Place;
	
	
	@Beanc(properties = "name,id,place") // JSON value which we need to be stored 
	public Employee_info(String name, int id, String place) {
		
		this.Name = name;
		this.Id = id;
		this.Place = place;
	}
	// Create the the getters and setters
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		this.Place = place;
	}
	@Override
	public String toString() {
		return "Employee_info [Name=" + Name + ", Id=" + Id + ", Place=" + Place + "]";
	}
	
	
	
	
	
	

}
