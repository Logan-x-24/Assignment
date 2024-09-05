package com.example.Assignment.controller;

import com.example.Assignment.choices.Location;
import com.example.Assignment.choices.ManufacturingProcess;
import com.example.Assignment.choices.NatureOfBusiness;
import com.example.Assignment.model.Supplier;
import com.example.Assignment.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
public class SupplierController {

    private final SupplierService supplierService;
    @PostMapping("/api/supplier/save")
    public Supplier save(@RequestBody Supplier supplier){
        return supplierService.saveSupplier(supplier);
    }

    @GetMapping("/api/supplier/get")
    public List<Supplier> getAll(){
        return supplierService.findAllSupplier();
    }

    @GetMapping("/api/supplier/getBy")
    public List<Supplier> getBy(@RequestParam(required = false) Location location,
                                @RequestParam(required = false) NatureOfBusiness natureOfBusiness ,
                                @RequestParam(required = false) ManufacturingProcess manufacturingProcess){

        return supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcess);
    }




}
