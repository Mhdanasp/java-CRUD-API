package com.bank.services;

import com.bank.model.Customer;
import com.bank.repositories.CustomerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private final CustomerRepositories customerRepositories;

    public CustomerService(CustomerRepositories customerRepositories) {
        this.customerRepositories = customerRepositories;
    }

    public Customer createCustomer(Customer customer){
        return customerRepositories.save(customer);
    }

    public List<Customer> getAllCustomer(){
        return customerRepositories.findAll();
    }

    public Optional<Customer> getCustomerById(Long Id){
        return customerRepositories.findById(Id);
    }

    public Customer updateCustomer(Long id ,Customer updatedCustomer){
        return customerRepositories.findById(id)
                .map(existing ->{
                    existing.setFirstName(updatedCustomer.getFirstName());
                    existing.setLastName(updatedCustomer.getLastName());
                    existing.setEmail(updatedCustomer.getEmail());
                    return customerRepositories.save(existing);
                }).orElseThrow(() -> new RuntimeException("Customer not found with id" + id));
    }

    public void deleteCustomer(Long id){
        if (!customerRepositories.existsById(id)){
            throw new RuntimeException("Customer not found with id "+id+" so deletion is not possible");
        }
        customerRepositories.deleteById(id);
    }
}
