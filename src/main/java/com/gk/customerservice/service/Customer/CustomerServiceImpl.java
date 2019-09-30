package com.gk.customerservice.service.Customer;

import com.gk.customerservice.dto.Customer;
import com.gk.customerservice.repository.Customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    @Transactional
    public void addCustomer(Customer c) {
        customerRepository.save(c);

    }

    @Override
    public Customer getCustomer(String id) {
        System.out.println(customerRepository.exists(id));
        return  customerRepository.findOne(id);
    }

    @Override
    public void deleteCustomer(Customer customer) {

    }

    @Override
    public List<Customer> getAllCustomer() {
       return customerRepository.findAll();

       // return null;
    }
}
