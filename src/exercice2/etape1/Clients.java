package exercice2.etape1;

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
	}
}
