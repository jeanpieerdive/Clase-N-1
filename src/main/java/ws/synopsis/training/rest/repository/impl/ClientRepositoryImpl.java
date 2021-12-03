package ws.synopsis.training.rest.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import ws.synopsis.training.rest.model.Client;
import ws.synopsis.training.rest.repository.ClientRepository;

@Repository
public class ClientRepositoryImpl implements ClientRepository {
	
	private static final Map<Long, Client> CLIENTS;
	static {
		CLIENTS = new HashMap<Long, Client>();
		CLIENTS.put(1L, Client.builder().idClient(1L).name("Jean").lastName("D\u00EDaz").build());
		CLIENTS.put(2L, Client.builder().idClient(2L).name("Pieer").lastName("Velasquez").build());
		CLIENTS.put(3L, Client.builder().idClient(3L).name("Pedro").lastName("Coontreras").build());
		CLIENTS.put(4L, Client.builder().idClient(4L).name("Luis").lastName("Torres").build());
	}
	
	@Override
	public List<Client> list(){
		return CLIENTS.entrySet().stream().map(k -> k.getValue()).collect(Collectors.toList());
	}
    
	@Override
	public void add(Client client) {
		long id = (long) CLIENTS.size();
		client.setIdClient(id);
		CLIENTS.put(id, client);
	}
}







