/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ejemplo.IPC1.services;

import com.Ejemplo.IPC1.Dtos.ClienteDto;
import com.Ejemplo.IPC1.Repositories.ClienteRepository;
import com.ejemplo.ipc1.models.Cliente;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author crist
 */

@Transactional
@Service
@Slf4j
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Transactional
    public Cliente crearCliente(ClienteDto dto){
        final Cliente cliente = new Cliente();
        cliente.setApellido(dto.getApellido());
        cliente.setDireccion(dto.getDireccion());
        cliente.setEdad(dto.getEdad());
        cliente.setId(dto.getId());
        cliente.setNombre(dto.getNombre());
        
        return clienteRepository.save(cliente);
    }
    
    @Transactional
    public Iterable<Cliente> verCliente(){
        return clienteRepository.findAll();
    }
    
    @Transactional
    public String elimnar(Integer id){
        final Cliente cliente = clienteRepository.findById(id).orElse(null);
        clienteRepository.delete(cliente);
        return "Eliminado";
    }
}
