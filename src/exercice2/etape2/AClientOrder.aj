package exercice2.etape2;

import java.util.ArrayList;
import java.util.List;

import exercice2.etape2.Order;

public aspect AClientOrder {

	private List<Order> Client.mOrders;
	
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
}
