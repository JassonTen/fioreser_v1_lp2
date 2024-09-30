/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.service;

import upeu.edu.pe.Fioreser.app.repository.DetallePedidoRepository;
import upeu.edu.pe.Fioreser.infrastructure.entity.DetallePedidoEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.PedidoEntity;

/**
 *
 * @author extre
 */
public class DetallePedidoService {
  private final DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository) {
        this.detallePedidoRepository = detallePedidoRepository;
    }

    public Iterable<DetallePedidoEntity> getDetallesByPedido(PedidoEntity pedidoEntity) {
        return detallePedidoRepository.getDetallesByPedido(pedidoEntity);
    }

    public DetallePedidoEntity getDetalleById(Integer id) {
        return detallePedidoRepository.getDetalleById(id);
    }

    public DetallePedidoEntity saveDetalle(DetallePedidoEntity detallePedidoEntity) {
        return detallePedidoRepository.saveDetalle(detallePedidoEntity);
    }

    public void deleteDetalleById(Integer id) {
        detallePedidoRepository.deleteDetalleById(id);  // Cambiado a void
    }  
}
