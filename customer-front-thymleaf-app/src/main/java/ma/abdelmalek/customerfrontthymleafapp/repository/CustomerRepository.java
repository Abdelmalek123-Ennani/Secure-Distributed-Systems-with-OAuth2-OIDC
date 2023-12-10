package ma.abdelmalek.customerfrontthymleafapp.repository;

import ma.abdelmalek.customerfrontthymleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
