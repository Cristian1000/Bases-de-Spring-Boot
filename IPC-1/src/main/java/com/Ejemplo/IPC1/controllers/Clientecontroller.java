/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ejemplo.IPC1.controllers;

import com.Ejemplo.IPC1.Dtos.ClienteDto;
import com.Ejemplo.IPC1.services.ClienteService;
import com.ejemplo.ipc1.models.Cliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

/**
 *
 * @author crist
 */
//@Api(tags = {"Cliente"})
@Validated
@RestController
@Slf4j
@RequestMapping("/cliente")
public class Clientecontroller {
    @Autowired
    private ClienteService clienteService;
    
    @PostMapping(path = "/crear", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cliente> crearCliente(@RequestBody ClienteDto dto){
        return ResponseEntity.ok(clienteService.crearCliente(dto));
    }
    
    @GetMapping(path = "/ver", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Iterable<Cliente>> verCliente(){
        return ResponseEntity.ok(clienteService.verCliente());
    }
    
    @DeleteMapping(path = "/eliminar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> crearCliente(@PathVariable Integer id){
        return ResponseEntity.ok(clienteService.elimnar(id));
    }
    
}
