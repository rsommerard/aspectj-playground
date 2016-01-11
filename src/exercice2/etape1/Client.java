package exercice2.etape1;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String mName;
	private String mAddress;
	private Clients mClients;
	private List<Order> mOrders;
	
	public Client(Clients clients) {
		mClients = clients;
		
		mOrders = new ArrayList<Order>();
	}
	
	public void addOrder(Order order) {
		mOrders.add(order);
	}
	
	public boolean hasOrder() {
		return ! mOrders.isEmpty();
	}
	
	public void delOrder(Order order) {
		mOrders.remove(order);
	}
}
