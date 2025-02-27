package es.daw.backend.controller;

import es.daw.backend.entity.Product;
import es.daw.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//AÑADO COMENTARIOS EN LA RAMA SECUNDARIA
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;
    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/expensive")
    public ResponseEntity<List<Product>> getExpensiveProducts(@RequestParam Double precio) {
        List<Product> products = productRepository.findByPriceGreaterThan(precio);
        return ResponseEntity.ok(products);
    }

}
