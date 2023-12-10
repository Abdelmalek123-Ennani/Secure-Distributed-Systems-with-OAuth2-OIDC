 package ma.abdelmalek.customerfrontthymleafapp;

import ma.abdelmalek.customerfrontthymleafapp.entities.Customer;
import ma.abdelmalek.customerfrontthymleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

 @SpringBootApplication
public class CustomerFrontThymleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
    }
    
    @Bean
     CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder().name("ahmed").email("ahmed@gmail.com").build());
            customerRepository.save(Customer.builder().name("khalid").email("khalid@gmail.com").build());
            customerRepository.save(Customer.builder().name("Sara").email("sara@gmail.com").build());
        };
    }

}
