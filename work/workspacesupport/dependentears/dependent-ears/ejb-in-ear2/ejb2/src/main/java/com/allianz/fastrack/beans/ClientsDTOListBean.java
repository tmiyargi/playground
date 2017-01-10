package com.allianz.fastrack.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.allianz.drmk22.beans.ClientDTO;

/**
 * Bean con toda la informaci�n de navegaci�n especificada en la definici�n de DB2.
 * @author ORSIATS
 */
public class ClientsDTOListBean implements Serializable {
	private static final long serialVersionUID = 1L;


				//tipoFigura(TOMADOR,CONDUCTOR,...),ClientDTO
	private Map<String, ClientDTO> clients= new HashMap<String, ClientDTO>();

	public ClientDTO getCliente(String tipoFig) {
		return clients.get(tipoFig);
	}	
	public void setCliente(String tipoFigura,ClientDTO client) {
		clients.put(tipoFigura, client);
	}	
	public void addField(String tipoFigura,ClientDTO client){
		clients.put(tipoFigura,client);
	}
	public Map<String, ClientDTO> getClients() {
		return clients;
	}
	public void setClients(Map<String, ClientDTO> clients) {
		this.clients = clients;
	}

	
}
