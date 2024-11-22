# Servicio REST Cliente

Este es un proyecto basado en Spring Boot que proporciona un servicio REST para consultar información básica de un cliente.

---

## **Tabla de contenido**
- [Características](#características)
- [Requisitos previos](#requisitos-previos)
- [Uso del servicio](#uso-del-servicio)

---

## **Características**

- Servicio REST que expone un endpoint para consultar información de clientes.
- Datos "quemados" (sin conexión a bases de datos).
- Manejo básico de validaciones de entrada.
- Soporte para logs en diferentes niveles (INFO, WARN, DEBUG).
- Uso de herramientas modernas como Lombok para reducir código repetitivo.

---

## **Requisitos previos**

Antes de ejecutar este proyecto, asegúrate de cumplir con los siguientes requisitos:

1. **Java 17** o superior instalado.
    - Verifica la instalación ejecutando: `java -version`.
2. **Maven** instalado para compilar el proyecto (opcional si usas el JAR generado).
    - Verifica la instalación ejecutando: `mvn -version`.

## **Uso del servicio**
GET	/api/clientes/consultar	tipoDocumento (C o P), numeroDocumento	JSON con datos del cliente

Ejemplo de solicitud
- http://localhost:8080/api/clientes/consultar?tipoDocumento=C&numeroDocumento=123456

Respuesta exitosa:

json

{
"primerNombre": "José",
"SegundoNombre": "Luis",
"primerApellido": "Pérez",
"SegundoApellido": "González",
"telefono": "123456789",
"direccion": "Calle Falsa 123",
"ciudadResidencia": "Bogotá"
}

Error (cuando el tipo de documento es inválido):

json

{

"message": "Tipo de documento no permitido. Debe usar una C para cédula o P para pasaporte"

}