package com.onlinefood.service;


import java.util.List;

import com.onlinefood.model.Customer;

public interface CustomerService {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);
}
