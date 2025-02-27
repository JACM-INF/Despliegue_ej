package es.daw.backend.repository;


import es.daw.backend.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//! Sin barra en la url
@RepositoryRestResource(path = "products")

@CrossOrigin(origins = {"http://localhost:5174","https://localhost:4200"})
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByNameContainingIgnoreCase(String name);

    List<Product> findByPriceGreaterThan(Double price);
}
