
public class Customer {
	  public int Id;
	  public String City;
	

	  
	  
	  
	  
	public Customer() {
		System.out.println( "müşteri nesneni başlatıldı.");
		
	}
	
	
	public Customer(int id, String city) {
		
		Id = id;
		City=city;
		
		
		
		
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}  
	

	


}
