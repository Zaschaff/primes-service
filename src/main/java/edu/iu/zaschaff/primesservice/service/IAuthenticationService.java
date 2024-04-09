package edu.iu.tariqnb.primesservice.service;

import edu.iu.tariqnb.primesservice.model.Customer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.io.IOException;

public interface IAuthenticationService {
    Customer register(Customer customer) throws IOException;
    boolean login(String username,String password) throws IOException;

    UserDetails loadUserByUsername(String username)
        throws UsernameNotFoundException;
}
