package com.udea.edu.co.microservices.accounting.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private long id;

    @JsonProperty("account_number")
    @ApiModelProperty(hidden = true)
    private String accountNumber;

    @JsonProperty("account_class")
    private String accountClass;
    @JsonProperty("detail")
    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<AccountBreakdown> accountBreakdowns;
}
