/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.Fioreser.infrastructure.entity.adapter;

import org.springframework.data.repository.CrudRepository;
import upeu.edu.pe.Fioreser.infrastructure.entity.ClienteEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.ProductoEntity;

/**
 *
 * @author extre
 */
public interface ProductoCrudRepository extends CrudRepository<ProductoEntity, Integer>{
    Iterable<ProductoEntity> findByClienteEntity(ClienteEntity ClienteEntity);
    
}
