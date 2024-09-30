/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Fioreser.app.service;

import upeu.edu.pe.Fioreser.app.repository.EnvioRepository;
import upeu.edu.pe.Fioreser.infrastructure.entity.EnvioEntity;
import upeu.edu.pe.Fioreser.infrastructure.entity.PedidoEntity;

/**
 *
 * @author extre
 */
public class EnvioService {
    private final EnvioRepository envioRepository;

    public EnvioService(EnvioRepository envioRepository) {
        this.envioRepository = envioRepository;
    }

    public Iterable<EnvioEntity> getEnviosByPedido(PedidoEntity pedidoEntity) {
        return envioRepository.getEnviosByPedido(pedidoEntity);
    }

    public EnvioEntity getEnvioById(Integer id) {
        return envioRepository.getEnvioById(id);
    }

    public EnvioEntity saveEnvio(EnvioEntity envioEntity) {
        return envioRepository.saveEnvio(envioEntity);
    }

    public void deleteEnvioById(Integer id) {
        envioRepository.deleteEnvioById(id);  // Cambiado a void
    }
}
