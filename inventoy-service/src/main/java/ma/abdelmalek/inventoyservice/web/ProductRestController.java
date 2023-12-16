package ma.abdelmalek.inventoyservice.web;


import ma.abdelmalek.inventoyservice.entities.Product;
import ma.abdelmalek.inventoyservice.repostories.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @GetMapping("/products")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
