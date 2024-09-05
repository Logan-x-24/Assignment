package com.example.Assignment.service;

import com.example.Assignment.choices.Location;
import com.example.Assignment.choices.ManufacturingProcess;
import com.example.Assignment.choices.NatureOfBusiness;
import com.example.Assignment.model.Supplier;
import com.example.Assignment.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierService {

    private final SupplierRepository supplierRepository;

    public Supplier saveSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
    }

    public List<Supplier> findAllSupplier(){
        return supplierRepository.findAll();
    }

    public List<Supplier> findSuppliers(Location location, NatureOfBusiness natureOfBusiness , ManufacturingProcess manufacturingProcess){
        return supplierRepository.findSuppliers(location,natureOfBusiness,manufacturingProcess);
    }

}
