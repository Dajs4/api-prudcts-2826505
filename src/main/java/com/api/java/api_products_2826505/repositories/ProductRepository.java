package com.api.java.api_products_2826505.repositories;

import org.springframework.data.repository.CrudRepository;

//Repositorio por cada entidad
public interface ProductRepository<Product> extends CrudRepository<Product, Long>
{
    
}
