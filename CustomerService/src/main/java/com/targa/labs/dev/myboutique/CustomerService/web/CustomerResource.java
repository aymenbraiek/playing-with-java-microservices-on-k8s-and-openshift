package com.targa.labs.dev.myboutique.CustomerService.web;

import com.targa.labs.dev.myboutique.CustomerService.service.CustomerService;

import com.targa.labs.dev.myboutique.myboutique.commons.dto.CustomerDto;
import com.targa.labs.dev.myboutique.myboutique.commons.utils.Web;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;



/**
 * @author n.lamouchi
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(Web.API + "/customers")
public class CustomerResource {

    private final CustomerService customerService;

    @GetMapping
    public List<CustomerDto> findAll() {
        return this.customerService.findAll();
    }

    @GetMapping("/{id}")
    public CustomerDto findById(@PathVariable Long id) {
        return this.customerService.findById(id);
    }

    @GetMapping("/active")
    public List<CustomerDto> findAllActive() {
        return this.customerService.findAllActive();
    }

    @GetMapping("/inactive")
    public List<CustomerDto> findAllInactive() {
        return this.customerService.findAllInactive();
    }

    @PostMapping
    public CustomerDto create(CustomerDto customerDto) {
        return this.customerService.create(customerDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.customerService.delete(id);
    }

}