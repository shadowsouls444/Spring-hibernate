package com.App.AppAppJava.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Para decir que es una entidad
@Table (name = "roles") //Para decir que es una tabla y colocar el nombre exacto
@Data  //Encapsula los atributos
@NoArgsConstructor //Constructor vacio
@AllArgsConstructor //Constructor con parametros

public class Role {

    @Id //Llave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Generar llave primaria

    @Column(name = "id_role") //Ingresar los datos al campo
       private Long id;

    @Column(name = "name", length = 50) //unique para identificarlo como unico
       private String name;

    @Column(name = "description", length = 50) //Ingresar los datos al campo
       private String description;

}
