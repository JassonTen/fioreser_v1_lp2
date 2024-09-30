/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.Fioreser.infrastructure.entity.adapter;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import upeu.edu.pe.Fioreser.infrastructure.entity.ClienteEntity;

/**
 *
 * @author extre
 */
public interface ClienteCrudRepository extends CrudRepository<ClienteEntity, Integer>{
     public Optional<ClienteEntity> findByCorreo(String correo);
    
}
