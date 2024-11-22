package com.pruebabackendnttdata.serviciorestcliente.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest
public class ClienteControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testConsultarCliente_TipoDocumentoValido() throws Exception {
        mockMvc.perform(get("/api/clientes/consultar")
            .param("tipoDocumento", "C")
            .param("numeroDocumento", "12345"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.primerNombre").value("José"))
            .andExpect(jsonPath("$.ciudadResidencia").value("Bogotá"));
    }
    @Test
    public void testConsultarCliente_TipoDocumentoNoValido() throws Exception {
        mockMvc.perform(get("/api/clientes/consultar")
                .param("tipoDocumento", "X")
                .param("numeroDocumento", "12345"))
                .andExpect(status().isBadRequest());
    }
    
}
