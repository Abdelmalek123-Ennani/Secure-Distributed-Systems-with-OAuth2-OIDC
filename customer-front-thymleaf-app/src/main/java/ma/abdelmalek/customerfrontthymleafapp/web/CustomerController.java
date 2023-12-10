package ma.abdelmalek.customerfrontthymleafapp.web;

import ma.abdelmalek.customerfrontthymleafapp.entities.Customer;
import ma.abdelmalek.customerfrontthymleafapp.repository.CustomerRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public String costumers(Model model) {
        List<Customer> customerList= customerRepository.findAll();
        model.addAttribute("customers" , customerList);
        return "customers";
    }

    @GetMapping("/products")
    public String products(Model model) {
        return "products";
    }

    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication) {
        return authentication;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}