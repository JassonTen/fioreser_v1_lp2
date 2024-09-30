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

/**
 *
 * @author extre
 */
@Entity
@Table(name = "Detalle_Pedido")
public class DetallePedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDP;
    private Integer cantidad;
    private BigDecimal precioU;
    @ManyToOne
    @JoinColumn(name = "idP", nullable = false)
    private PedidoEntity pedidoEntity;
    @ManyToOne
    @JoinColumn(name = "idPRO", nullable = false)
    private ProductoEntity productoEntity; 

    public DetallePedidoEntity() {
    }

    public DetallePedidoEntity(Integer idDP, Integer cantidad, BigDecimal precioU, PedidoEntity pedidoEntity, ProductoEntity productoEntity) {
        this.idDP = idDP;
        this.cantidad = cantidad;
        this.precioU = precioU;
        this.pedidoEntity = pedidoEntity;
        this.productoEntity = productoEntity;
    }

    public Integer getIdDP() {
        return idDP;
    }

    public void setIdDP(Integer idDP) {
        this.idDP = idDP;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioU() {
        return precioU;
    }

    public void setPrecioU(BigDecimal precioU) {
        this.precioU = precioU;
    }

    public PedidoEntity getPedidoEntity() {
        return pedidoEntity;
    }

    public void setPedidoEntity(PedidoEntity pedidoEntity) {
        this.pedidoEntity = pedidoEntity;
    }

    public ProductoEntity getProductoEntity() {
        return productoEntity;
    }

    public void setProductoEntity(ProductoEntity productoEntity) {
        this.productoEntity = productoEntity;
    }
    
    
}
