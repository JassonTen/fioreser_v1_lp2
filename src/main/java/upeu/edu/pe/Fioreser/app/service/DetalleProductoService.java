/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.service;

import upeu.edu.pe.Fioreser.app.repository.DetalleProductoRepository;
import upeu.edu.pe.Fioreser.infrastructure.entity.DetalleProductoEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.ProductoEntity;

/**
 *
 * @author extre
 */
public class DetalleProductoService {
    private final DetalleProductoRepository detalleProductoRepository;

    public DetalleProductoService(DetalleProductoRepository detalleProductoRepository) {
        this.detalleProductoRepository = detalleProductoRepository;
    }

    public Iterable<DetalleProductoEntity> getDetallesByProducto(ProductoEntity productoEntity) {
        return detalleProductoRepository.getDetallesByProducto(productoEntity);
    }

    public DetalleProductoEntity getDetalleById(Integer id) {
        return detalleProductoRepository.getDetalleById(id);
    }

    public DetalleProductoEntity saveDetalle(DetalleProductoEntity detalleProductoEntity) {
        return detalleProductoRepository.saveDetalle(detalleProductoEntity);
    }

    public void deleteDetalleById(Integer id) {
        detalleProductoRepository.deleteDetalleById(id);  // Cambiado a void
    }
}
