package exercice2.etape2;

import java.util.ArrayList;
import java.util.List;

public class Clients {
	
	private List<Client> mClients;
	
	public Clients() {
		mClients = new ArrayList<Client>();
	}
	
	public void addClient(Client client) {
		mClients.add(client);
	}
	
	public void delClient(Client client) {
		mClients.remove(client);
		System.out.println(client.toString() + " deleted.");
	}
}
