package springIntro;

public class CustomerManager implements ICustomerService {
	private ICustomerDal customerDal;
	
	//constructor injection
	 public CustomerManager(ICustomerDal customerDal) {
		 //ICustomerDal bir referans tip. Onu implement edenleri CustomerManager'a parametre verebilirsin demek.
		this.customerDal = customerDal;
	}
	public void add() {
		 //related tasks
		 customerDal.add();
	 }
	 
}
