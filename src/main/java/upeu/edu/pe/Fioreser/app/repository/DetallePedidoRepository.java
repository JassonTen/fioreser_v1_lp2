/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.repository;

import upeu.edu.pe.Fioreser.infrastructure.entity.DetallePedidoEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.PedidoEntity;

/**
 *
 * @author extre
 */
public interface DetallePedidoRepository {
   Iterable<DetallePedidoEntity> getDetallesByPedido(PedidoEntity pedidoEntity);
    DetallePedidoEntity getDetalleById(Integer id);
    DetallePedidoEntity saveDetalle(DetallePedidoEntity detallePedidoEntity);
    void deleteDetalleById(Integer id); 
}
