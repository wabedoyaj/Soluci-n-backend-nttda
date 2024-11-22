package com.pruebabackendnttdata.serviciorestcliente.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Clase que representa a un cliente.
 * Utiliza Lombok para generar automáticamente getters, setters y constructores.
 */
@Data //Genera getters y setters
@AllArgsConstructor //Genera constructor con todos los campos
@NoArgsConstructor  //Genera un constructor vacio 
public class Cliente {
    
    private String primerNombre;
    private String SegundoNombre;
    private String primerApellido;
    private String SegundoApellido;
    private String telefono;
    private String direccion;
    private String ciudadResidencia;    


}
