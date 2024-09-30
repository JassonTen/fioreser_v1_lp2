/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.repository;

import upeu.edu.pe.Fioreser.infrastructure.entity.ClienteEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.PedidoEntity;

/**
 *
 * @author extre
 */
public interface PedidoRepository {
   Iterable<PedidoEntity> getAllPedidos();
    Iterable<PedidoEntity> getPedidosByCliente(ClienteEntity clienteEntity);
    PedidoEntity getPedidoById(Integer id);
    PedidoEntity savePedido(PedidoEntity pedidoEntity);
    void deletePedidoById(Integer id); 
}
