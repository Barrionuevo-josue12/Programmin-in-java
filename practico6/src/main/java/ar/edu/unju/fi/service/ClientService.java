package ar.edu.unju.fi.service;

import ar.edu.unju.fi.domain.Client;
import ar.edu.unju.fi.repository.ClientRepository;
import jakarta.transaction.Transactional;

import java.time.LocalDate;

public class ClientService {
    private final ClientRepository clientRepository;

    //constructor
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    @Transactional
    public Client createClient(Client client) {
        //if already existed a client with on email return an exception
        clientRepository.findByEmail(client.getEmail()).ifPresent(ex -> {
            throw new IllegalArgumentException("Ya existe un usuario con el email:" + client.getEmail());
        });
        clientRepository.findById(client.getId()).ifPresent(ex -> {
            throw new IllegalArgumentException("Ya existe un usuario con el id" + client.getId());
        });
        if (client.getFirstDayLogin() == null) {
            client.setFirstDayLogin(LocalDate.now());
        }
        //if client is "correct" this is saved
        return clientRepository.save(client);
    }

    public Client lookForClientById (Long id){
       return  clientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No existe un cliente con el id: " +id));
    }
    @Transactional
    public void deleteClientById (Long id){
        if(!clientRepository.existsById(id)){
            throw new IllegalArgumentException("El usuario con id:"+id+" no existe");
        }
        clientRepository.deleteById(id);
    }
}
