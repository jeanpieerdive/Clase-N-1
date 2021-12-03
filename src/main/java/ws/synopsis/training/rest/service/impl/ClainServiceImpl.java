package ws.synopsis.training.rest.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import ws.synopsis.training.rest.bean.*;
import ws.synopsis.training.rest.model.Client;
import ws.synopsis.training.rest.repository.ClientRepository;
import ws.synopsis.training.rest.service.ClientService;

@Service
@AllArgsConstructor
public class ClainServiceImpl implements ClientService {
	
	private ClientRepository clientRepository;

	@Override
	public List<Client> list() {
		return clientRepository.list();
	}
	@Override
	public void add(ClientRequest beanReq) {
		clientRepository.add(
            Client.builder().name(beanReq.getName()).lastName(beanReq.getLastName()).build()
	    );
	}
}
