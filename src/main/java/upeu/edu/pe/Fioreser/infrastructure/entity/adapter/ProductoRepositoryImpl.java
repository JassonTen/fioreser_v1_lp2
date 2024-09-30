/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Fioreser.infrastructure.entity.adapter;

import org.springframework.stereotype.Repository;
import upeu.edu.pe.Fioreser.app.repository.ProductoRepository;
import upeu.edu.pe.Fioreser.infrastructure.entity.ClienteEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.ProductoEntity;

/**
 *
 * @author extre
 */
@Repository
public class ProductoRepositoryImpl implements ProductoRepository{
    
     private final ProductoCrudRepository productoCrudRepository;
     
    public ProductoRepositoryImpl(ProductoCrudRepository productoCrudRepository) {
        this.productoCrudRepository = productoCrudRepository;
    }

    @Override
    public Iterable<ProductoEntity> getProductos() {
        return productoCrudRepository.findAll();
    }

    @Override
    public Iterable<ProductoEntity> getProductosByCliente(ClienteEntity cliente) {
        return productoCrudRepository.findByClienteEntity(cliente);
    }

    //metodo para traer un solo producto
    @Override
    public ProductoEntity getProductoById(Integer id) {
        return productoCrudRepository.findById(id).get();
    }

    @Override
    public ProductoEntity saveProducto(ProductoEntity products) {
        return productoCrudRepository.save(products);
    }

    @Override
    public void deleteProductoById(Integer id) {
        productoCrudRepository.deleteById(id);

    }

}
