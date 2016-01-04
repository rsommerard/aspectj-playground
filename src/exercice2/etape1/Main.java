package exercice2.etape1;

public class Main {

	public static void main(String[] args) {
		Clients clients = new Clients();
		
		Client client1 = new Client(clients);
		Client client2 = new Client(clients);
		Client client3 = new Client(clients);
		
		Orders orders = new Orders();
		
		Order order1 = new Order(orders);
		Order order2 = new Order(orders);
		Order order3 = new Order(orders);
		Order order4 = new Order(orders);
		
		client3.addOrder(order2);
		System.out.println("client3 has order: " + client3.hasOrder());
		
		client3.addOrder(order1);
		client2.addOrder(order3);
		client1.addOrder(order4);
		
		order1.printOrder();
		order3.printOrder();
		
		clients.delClient(client1);
		orders.delOrder(order3);
	}

}
