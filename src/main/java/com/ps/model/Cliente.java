package com.ps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Los @ son llamados anotaciones y su funcion es cambiar el comportamiento del codigo
@Data //me genera los Sets y Gets
@NoArgsConstructor // me genera un constructor sin argumentos
@AllArgsConstructor // me genera un constructor con todos los argumentos
@Entity // Especifica que esta clase representa un modelo de la BD "entidad"
@Table(name = "Clientes") // Especifica el nombre de la tabla en la BD
public class Cliente {
        @Id // Especifica que este campo es el ID
        @Column(name = "client_id") //Especifica el nombre de la BD  "la columna"
        @GeneratedValue(strategy = GenerationType.IDENTITY) //va generando automatica/ solo el ID
        private Long clientId;
        private String nombre;
        private String apellido;
        private String direccion;
        private String telefono;
        private String email;
}

