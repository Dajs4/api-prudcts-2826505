package com.api.java.api_products_2826505.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Repositorio por cada entidad
@Repository
public interface ProductRepository<Product> extends CrudRepository<Product, Long>
{
    
}
