package com.gk.customerservice.service.Customer;

import com.gk.customerservice.dto.Customer;

import java.util.List;

public interface CustomerService {
    public void addCustomer(Customer c);
    public Customer getCustomer(String id);
    public void deleteCustomer(Customer customer);
    public List<Customer> getAllCustomer();

}
