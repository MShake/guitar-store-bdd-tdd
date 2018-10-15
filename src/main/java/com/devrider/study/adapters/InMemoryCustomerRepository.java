package com.devrider.study.adapters;

import com.devrider.study.domain.Customer;
import com.devrider.study.domain.CustomerRepository;

import java.util.Set;

public class InMemoryCustomerRepository implements CustomerRepository {

    public void add(Customer customer) {

    }

    @Override
    public Set<Customer> all() {
        return null;
    }
}
