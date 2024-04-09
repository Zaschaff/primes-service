package edu.iu.tariqnb.primesservice.repository;

import edu.iu.tariqnb.primesservice.model.Customer;
import org.springframework.security.config.Customizer;

import java.io.IOException;

public interface IAuthenticationRepository {
    boolean save(Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;
}
