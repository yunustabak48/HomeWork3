
public class Main {

	public static void main(String[] args) {
		CreditManager creditmanager =new CreditManager();
		creditmanager.Save();
		creditmanager.Calculate();
		Customer customer =new Customer ();
		customer.Id =1;
		customer.City ="İzmir";
		
		
		CustomerManager customerManager = new CustomerManager (customer, null);
		customerManager.Save();
		customerManager.Delete();
		Company company =new Company () ;
		company.TaxNumber="1566488";
		company.CompanyName ="kumtel";
		company.Id = 500;
		
		CustomerManager customerManager2 = new CustomerManager (new Company(), null );
		
		Person person =new Person ();
		person.FirstName ="atakan";
		person.NationalIdendity ="56452384";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company ();
		CustomerManager customerManager3 =new CustomerManager(new Customer(),new MilitaryCreditManager());
		customerManager.GiveCredit();
		
		
		
				

	}

}
