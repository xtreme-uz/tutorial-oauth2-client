package uz.xtreme.oauth2resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rustambekov Avazbek
 * Date: 26/12/2019
 * Time: 12:42
 */

@Service
public class ResourceService {

    private List<Customer> customers;

    public ResourceService() {
        this.customers = new ArrayList<>();
    }

    @PreAuthorize("hasAnyRole('admin')")
    public Customer create(Customer customer){
        customers.add(customer);
        return customer;
    }

    @PreAuthorize("hasAnyAuthority('read_profile')")
    public Customer get(int id) {
        return customers.get(--id);
    }

    @PreAuthorize("hasAnyAuthority('read_profile')")
    public List<Customer> getAll() {
        return customers;
    }

}
