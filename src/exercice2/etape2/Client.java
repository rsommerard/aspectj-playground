package exercice2.etape2;

public class Client extends Clients {
	
	private String mName;
	private String mAddress;
	private Clients mClients;
	
	public Client(Clients clients) {
		mClients = clients;
	}
}
