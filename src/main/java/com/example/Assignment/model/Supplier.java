package com.example.Assignment.model;

import com.example.Assignment.choices.Location;
import com.example.Assignment.choices.ManufacturingProcess;
import com.example.Assignment.choices.NatureOfBusiness;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Supplier {

    @Id
    @Column(name = "supplier_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer supplierId;

    @Column(name = "company_name")
    @JsonProperty("company_name")
    private String companyName;

    @Column(name = "website")
    @JsonProperty("website")
    private String website;

    @Column(name = "location")
    @Enumerated(EnumType.STRING)
    @JsonProperty("location")
    private Location location;

    @Column(name = "nature_of_business")
    @Enumerated(EnumType.STRING)
    @JsonProperty("nature_of_business")
    private NatureOfBusiness natureOfBusiness;
    @Column(name = "manufacturing_process")
    @Enumerated(EnumType.STRING)
    @JsonProperty("manufacturing_process")
    private ManufacturingProcess manufacturingProcess;






}
