/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.repository;

import upeu.edu.pe.Fioreser.infrastructure.entity.ClienteEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.ProductoEntity;

/**
 *
 * @author extre
 */
public interface ProductoRepository {
  Iterable<ProductoEntity> getAllProductos();
    ProductoEntity getProductoById(Integer id);
    ProductoEntity saveProducto(ProductoEntity productoEntity);
    void deleteProductoById(Integer id);
}
