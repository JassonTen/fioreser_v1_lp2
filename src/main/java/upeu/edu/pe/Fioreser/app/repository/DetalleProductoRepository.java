/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.repository;

import upeu.edu.pe.Fioreser.infrastructure.entity.DetalleProductoEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.ProductoEntity;

/**
 *
 * @author extre
 */
public interface DetalleProductoRepository {
    Iterable<DetalleProductoEntity> getDetallesByProducto(ProductoEntity productoEntity);
    DetalleProductoEntity getDetalleById(Integer id);
    DetalleProductoEntity saveDetalle(DetalleProductoEntity detalleProductoEntity);
    void deleteDetalleById(Integer id);
}
