package exercice2.etape1;

public class Order {

	private Orders mOrders;
	private int mId;
	private double mAmount;
	private Client mClient;
	
	public Order(Orders orders) {
		mOrders = orders;
	}
	
	public void setClient(Client client) {
		mClient = client;
	}
	
	public Client getClient() {
		return mClient;
	}
	
	public void printOrder() {
		System.out.println("id: " + mId + ", amount: " + mAmount);
	}
}
