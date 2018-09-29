package com.udea.edu.co.microservices.accounting.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(hidden = true)
    private long id;

    @JsonProperty("categoria")
    private String categoria;

    @JsonProperty("codigo_inventario")
    private String codigoInvenario;

    @JsonProperty("costo")
    private BigDecimal costo;

    @JsonProperty("cantidad")
    private Integer cantidad;

}
