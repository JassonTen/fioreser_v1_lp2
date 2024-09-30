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
@Table(name = "Pedido")
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idP;
    private String nroPedido;
    private String estadoPedido;
    private LocalDateTime fechaEmision;
    private BigDecimal totalPago;
    private String tipoBolFact;
    private String nroBolFactura;
    private String metodoPago;

    @ManyToOne
    @JoinColumn(name = "idC")
    private ClienteEntity clienteEntity;

    public PedidoEntity() {
    }

    public PedidoEntity(Integer idP, String nroPedido, String estadoPedido, LocalDateTime fechaEmision, BigDecimal totalPago, String tipoBolFact, String nroBolFactura, String metodoPago, ClienteEntity clienteEntity) {
        this.idP = idP;
        this.nroPedido = nroPedido;
        this.estadoPedido = estadoPedido;
        this.fechaEmision = fechaEmision;
        this.totalPago = totalPago;
        this.tipoBolFact = tipoBolFact;
        this.nroBolFactura = nroBolFactura;
        this.metodoPago = metodoPago;
        this.clienteEntity = clienteEntity;
    }

   

    public Integer getIdP() {
        return idP;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }


    public String getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(String nroPedido) {
        this.nroPedido = nroPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public BigDecimal getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(BigDecimal totalPago) {
        this.totalPago = totalPago;
    }

    public String getTipoBolFact() {
        return tipoBolFact;
    }

    public void setTipoBolFact(String tipoBolFact) {
        this.tipoBolFact = tipoBolFact;
    }

    public String getNroBolFactura() {
        return nroBolFactura;
    }

    public void setNroBolFactura(String nroBolFactura) {
        this.nroBolFactura = nroBolFactura;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public ClienteEntity getClienteEntity() {
        return clienteEntity;
    }

    public void setClienteEntity(ClienteEntity clienteEntity) {
        this.clienteEntity = clienteEntity;
    }

   
    
}