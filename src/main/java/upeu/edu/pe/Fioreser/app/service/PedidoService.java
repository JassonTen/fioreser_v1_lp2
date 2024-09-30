/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.service;

import java.time.LocalDateTime;
import upeu.edu.pe.Fioreser.app.repository.PedidoRepository;
import upeu.edu.pe.Fioreser.infrastructure.entity.ClienteEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.PedidoEntity;

/**
 *
 * @author extre
 */
public class PedidoService {
   private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Iterable<PedidoEntity> getPedidos() {
        return pedidoRepository.getAllPedidos();
    }

    public PedidoEntity getPedidoById(Integer id) {
        return pedidoRepository.getPedidoById(id);
    }

    public PedidoEntity savePedido(PedidoEntity pedidoEntity) {
    if (pedidoEntity.getIdP() == null) {
        // Nuevo pedido
        pedidoEntity.setFechaEmision(LocalDateTime.now());  // Fecha de emisión al crear
        return pedidoRepository.savePedido(pedidoEntity);
    } else {
        // Actualizar pedido
        PedidoEntity pedidoDB = pedidoRepository.getPedidoById(pedidoEntity.getIdP());
        
        // Mantener la fecha de emisión original
        pedidoEntity.setFechaEmision(pedidoDB.getFechaEmision());

        return pedidoRepository.savePedido(pedidoEntity);
    }
}

    public Iterable<PedidoEntity> getPedidosByCliente(ClienteEntity clienteEntity) {
        return pedidoRepository.getPedidosByCliente(clienteEntity);
    }

    public void deletePedidoById(Integer id) {
        pedidoRepository.deletePedidoById(id); 
    }
} 

