package exercice2.etape1;

import java.util.ArrayList;
import java.util.List;

public class Orders {

private List<Order> mOrders;
	
	public Orders() {
		mOrders = new ArrayList<Order>();
	}
	
	public void addOrder(Order order) {
		mOrders.add(order);
	}
	
	public void delOrder(Order order) {
		mOrders.remove(order);
	}
}
