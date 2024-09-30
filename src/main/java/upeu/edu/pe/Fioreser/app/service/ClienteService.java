/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.service;

import upeu.edu.pe.Fioreser.app.repository.ClienteRepository;
import upeu.edu.pe.Fioreser.infrastructure.entity.ClienteEntity;

/**
 *
 * @author extre
 */ 
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteEntity createCliente(ClienteEntity clienteEntity) {
        return clienteRepository.createCliente(clienteEntity);
    }

    public ClienteEntity findByCorreo(String correo) {
        return clienteRepository.findByCorreo(correo);
    }

    public ClienteEntity findById(Integer id) {
        return clienteRepository.findById(id);
    }
    
}







