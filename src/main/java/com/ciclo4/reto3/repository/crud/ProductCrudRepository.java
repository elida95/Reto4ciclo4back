package com.ciclo4.reto3.repository.crud;

import com.ciclo4.reto3.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductCrudRepository extends MongoRepository<Product, Integer> {

  // Para seleccionar el producto con id maximo // Para que en el front el id se
  // cree solo
  Optional<Product> findTopByOrderByIdDesc();

}
