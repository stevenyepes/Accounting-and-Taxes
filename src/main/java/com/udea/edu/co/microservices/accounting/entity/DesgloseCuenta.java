package com.udea.edu.co.microservices.accounting.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class DesgloseCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("codigo_inventario")
    private String codigoInvenario;

    @JsonProperty("valor")
    private BigDecimal valor;

    @JsonProperty("cantidad")
    private Integer cantidad;

}
