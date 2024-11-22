package com.pruebabackendnttdata.serviciorestcliente.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pruebabackendnttdata.serviciorestcliente.Entities.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
/**
 * Controlador REST maneja solicitudes relacionadas con los clientes.
 * Proporciona un endpoint para consultar datos de un cliente específico.
 * endpoint /api/clientes/consultar
 */

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    // Logger para registrar información sobre las solicitudes
    private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);

    @GetMapping("/consultar")
    public ResponseEntity<?> consultarCliente(@RequestParam String tipoDocumento,@RequestParam String numeroDocumento){
        
        logger.info("Solicitud recibida: tipoDocumento={}, numeroDocumento={}", tipoDocumento);

        if(!tipoDocumento.equalsIgnoreCase("C") && !tipoDocumento.equalsIgnoreCase("P")){
            logger.warn("Tipo de documento invalido:{}", tipoDocumento);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body("Tipo de documento no permitido. Debe usar una C para cedula o P para pasaporte");
        }
        
        Cliente clienteQuemado = new Cliente(
            "José",
            "Luis",
            "Pérez",
            "González",
            "123456789",
            "Calle Falsa 123",
            "Bogotá"
        );
        logger.debug("cliente creado: {}", clienteQuemado);

        logger.info("Solicitud exitosa para numeroDocumento={}",numeroDocumento);

        
        return ResponseEntity.ok(clienteQuemado);
    }

    


}
