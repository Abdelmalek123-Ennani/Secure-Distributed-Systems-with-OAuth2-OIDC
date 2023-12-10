package ma.abdelmalek.inventoyservice.repostories;

import ma.abdelmalek.inventoyservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
