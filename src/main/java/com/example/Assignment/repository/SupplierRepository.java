package com.example.Assignment.repository;

import com.example.Assignment.choices.Location;
import com.example.Assignment.choices.ManufacturingProcess;
import com.example.Assignment.choices.NatureOfBusiness;
import com.example.Assignment.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
    @Query("select s from Supplier s where s.location = :location and s.natureOfBusiness = :natureOfBusiness and s.manufacturingProcess = :manufacturingProcess")
    List<Supplier> findSuppliers(@Param("location") Location location, @Param("natureOfBusiness") NatureOfBusiness natureOfBusiness, @Param("manufacturingProcess") ManufacturingProcess manufacturingProcess);

}
