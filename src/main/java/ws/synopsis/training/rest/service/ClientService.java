package ws.synopsis.training.rest.service;

import java.util.List;

import ws.synopsis.training.rest.bean.ClientRequest;
import ws.synopsis.training.rest.model.Client;

public interface ClientService {
	public List<Client> list();
	public void add(ClientRequest beanReq);

}
