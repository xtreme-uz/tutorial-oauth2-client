package uz.xtreme.oauth2resource;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Rustambekov Avazbek
 * Date: 26/12/2019
 * Time: 12:42
 */

@RestController
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @RequestMapping(value = "customers", method = RequestMethod.PUT)
    public Customer create(@RequestBody Customer customer) {
        return resourceService.create(customer);
    }

    @RequestMapping(value = "customers/{id}", method = RequestMethod.GET)
    public Customer get(@PathVariable int id) {
        return resourceService.get(id);
    }

    @RequestMapping(value = "customers", method = RequestMethod.GET)
    public List<Customer> getAll() {
        return resourceService.getAll();
    }

}
