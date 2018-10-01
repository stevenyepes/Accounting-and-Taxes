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
public class AccountBreakdown {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private long id;

    @JsonProperty("category")
    private String category;

    @JsonProperty("inventory_code")
    private String inventoryCode;

    @JsonProperty("cost")
    private BigDecimal cost;

    @JsonProperty("quantity")
    private Integer quantity;

}
