package com.udea.edu.co.microservices.accounting.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private long id;

    @JsonProperty("numero_cuenta")
    @ApiModelProperty(hidden = true)
    private String numeroCuenta;

    @JsonProperty("clase")
    private String clase;
    @JsonProperty("detalle")
    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<DesgloseCuenta> desgloseCuentas;
}
