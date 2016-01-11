package exercice2.etape2;

public class Order {

	private Orders mOrders;
	private int mId;
	private double mAmount;
	
	public Order(Orders orders) {
		mOrders = orders;
	}
	
	public void printOrder() {
		System.out.println("id: " + mId + ", amount: " + mAmount);
	}
}
