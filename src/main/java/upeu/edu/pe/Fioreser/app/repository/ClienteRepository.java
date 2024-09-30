/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.repository;

import upeu.edu.pe.Fioreser.infrastructure.entity.ClienteEntity;

/**
 *
 * @author extre
 */
public interface ClienteRepository {
    public ClienteEntity createCliente(ClienteEntity clienteEntity);
    public ClienteEntity findByCorreo(String correo);
    public ClienteEntity findById(Integer id);
    
}
