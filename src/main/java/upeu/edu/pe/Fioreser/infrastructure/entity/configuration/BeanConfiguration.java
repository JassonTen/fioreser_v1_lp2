/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Fioreser.infrastructure.entity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import upeu.edu.pe.Fioreser.app.repository.ClienteRepository;
import upeu.edu.pe.Fioreser.app.repository.ProductoRepository;
import upeu.edu.pe.Fioreser.app.service.ClienteService;
import upeu.edu.pe.Fioreser.app.service.ProductoService;

/**
 *
 * @author extre
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public ProductoService productService(ProductoRepository productoRepository){
        return new ProductoService(productoRepository);
    }
    
    public ClienteService clienteService(ClienteRepository clienteRepository){
        return new ClienteService(clienteRepository);
    }
    
}
