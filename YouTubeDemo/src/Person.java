
public class Person extends Customer{
	public String NationalIdendity;
	  public String FirstName;
	  public String LastName;

	public Person() {
		
	}

	public Person(String nationalIdendity,String firstName,String lastName) {
		
		NationalIdendity = nationalIdendity;
		 FirstName = firstName;
		LastName =lastName;
	}

	public String getNationalIdendity() {
		return NationalIdendity;
	}

	public void setNationalIdendity(String nationalIdendity) {
		NationalIdendity = nationalIdendity;
	}

	public String getFirsName() {
		return FirstName;
	}

	public void setFirsName(String firsName) {
		FirstName = firsName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	
	

}
