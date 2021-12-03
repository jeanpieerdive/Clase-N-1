package ws.synopsis.training.rest.repository;

import java.util.List;

import ws.synopsis.training.rest.model.Client;

public interface ClientRepository {
	public List<Client> list();
    public void add(Client client);
}
