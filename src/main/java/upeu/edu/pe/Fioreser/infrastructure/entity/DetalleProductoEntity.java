/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Fioreser.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 *
 * @author extre
 */
@Entity
@Table(name = "Detalle_Producto")
public class DetalleProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idA;
    private Integer cantidad;
    private LocalDateTime fecha;
    private BigDecimal precio;
    @ManyToOne
    @JoinColumn(name = "idPRO", nullable = false)
    private ProductoEntity productoEntity;

    public DetalleProductoEntity() {
    }

    public DetalleProductoEntity(Integer idA, Integer cantidad, LocalDateTime fecha, BigDecimal precio, ProductoEntity productoEntity) {
        this.idA = idA;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.precio = precio;
        this.productoEntity = productoEntity;
    }

    public Integer getIdA() {
        return idA;
    }

    public void setIdA(Integer idA) {
        this.idA = idA;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public ProductoEntity getProductoEntity() {
        return productoEntity;
    }

    public void setProductoEntity(ProductoEntity productoEntity) {
        this.productoEntity = productoEntity;
    }

   
    
    
}
