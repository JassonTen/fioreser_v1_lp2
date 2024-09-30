/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.service;

import java.io.IOException;
import upeu.edu.pe.Fioreser.app.repository.ProductoRepository;
import upeu.edu.pe.Fioreser.infrastructure.entity.ProductoEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
/**
 *
 * @author extre
 */

@Service
public class ProductoService {
     private final ProductoRepository productoRepository;
    private final UploadFile uploadFile;

    public ProductoService(ProductoRepository productoRepository, UploadFile uploadFile) {
        this.productoRepository = productoRepository;
        this.uploadFile = uploadFile;
    }

    public Iterable<ProductoEntity> getProductos() {
        return productoRepository.getAllProductos();
    }

    public ProductoEntity getProductoById(Integer id) {
        return productoRepository.getProductoById(id);
    }

    public ProductoEntity saveProducto(ProductoEntity productoEntity, MultipartFile multipartFile) throws IOException {
        if (productoEntity.getIdPRO() == null) {
            // Nuevo producto
            productoEntity.setImagen(uploadFile.upload(multipartFile));  // Guarda la imagen
            return productoRepository.saveProducto(productoEntity);
        } else {
            // Actualizar producto
            ProductoEntity productoDB = productoRepository.getProductoById(productoEntity.getIdPRO());
            if (multipartFile.isEmpty()) {
                productoEntity.setImagen(productoDB.getImagen());  // Mantener imagen existente
            } else {
                if (!productoDB.getImagen().equals("default.png")) {
                    uploadFile.delete(productoDB.getImagen());  // Eliminar imagen antigua
                }
                productoEntity.setImagen(uploadFile.upload(multipartFile));  // Guardar nueva imagen
            }
            return productoRepository.saveProducto(productoEntity);
        }
    }

    public void deleteProductoById(Integer id) {
        productoRepository.deleteProductoById(id);  // Cambiado a void
    }
}
