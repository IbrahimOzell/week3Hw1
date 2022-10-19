package youToubeEgitim;

public class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		customer = customer;
		creditManager = creditManager;
	}
	
	public void save(Customer customer) {
		System.out.println("Müşteri kaydedildi ");
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri Silindi ");
			
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
	}
}
