package ma.abdelmalek.inventoyservice;

import ma.abdelmalek.inventoyservice.entities.Product;
import ma.abdelmalek.inventoyservice.repostories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoyServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Computer")
                            .price(4300)
                            .quantity(12)
                    .build());

            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Phone")
                    .price(8400)
                    .quantity(13)
                    .build());

            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Printer")
                    .price(3000)
                    .quantity(3)
                    .build());
        };
    }
}
