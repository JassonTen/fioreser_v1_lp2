/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.repository;

import upeu.edu.pe.Fioreser.infrastructure.entity.EnvioEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.PedidoEntity;

/**
 *
 * @author extre
 */
public interface EnvioRepository {
   Iterable<EnvioEntity> getEnviosByPedido(PedidoEntity pedidoEntity);
    EnvioEntity getEnvioById(Integer id);
    EnvioEntity saveEnvio(EnvioEntity envioEntity);
    void deleteEnvioById(Integer id); 
}
