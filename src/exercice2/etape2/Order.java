package exercice2.etape2;

public class Order extends Orders {

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
