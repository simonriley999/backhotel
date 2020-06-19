package com.hotel.dao;

import com.hotel.pojo.Customer;

import java.util.List;

public interface ICustomerDao {
    List<Customer> queryCustomer();
    
}
