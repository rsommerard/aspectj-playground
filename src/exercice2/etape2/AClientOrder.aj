package exercice2.etape2;

import java.util.ArrayList;
import java.util.List;

import exercice2.etape2.Order;

public aspect AClientOrder {

	private List<Order> Client.mOrders;
	private Client Order.mClient;
	
	public void Client.addOrder(Order order) {
		mOrders.add(order);
	}
	
	public boolean Client.hasOrder() {
		return ! mOrders.isEmpty();
	}
	
	public void Client.delOrder(Order order) {
		mOrders.remove(order);
	}
	
	after(): initialization(Client.new(..)) {
		Client client = (Client) thisJoinPoint.getTarget();
		client.mOrders = new ArrayList<Order>();
	}
	
	public void Order.setClient(Client client) {
		mClient = client;
	}
	
	public Client Order.getClient() {
		return mClient;
	}
	
	pointcut delClient(Client client): call(void Clients.delClient(Client)) && args(client);

	Object around(Client client): delClient(client) {
		if (client.hasOrder()) {
			System.out.println("Client has order: can't delete it.");
			return null;
		}
		
		Object ret = proceed(client);
		
		return ret;
	}
}
