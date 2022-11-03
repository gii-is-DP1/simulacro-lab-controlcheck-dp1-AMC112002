package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;



public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();
  
}
