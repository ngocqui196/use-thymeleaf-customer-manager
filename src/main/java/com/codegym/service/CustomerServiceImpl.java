package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customers.add(new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.add(new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.add(new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customers.add(new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.add( new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));

    }
    @Override
    public List<Customer> findAll() {

        return customers;
    }

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer findById(int id) {
//        for (Customer cu :
//                customers) {
//            if (cu.getId() == id) {
//                return cu;
//            }
//        }
//        return null;
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.set(customers.indexOf(customers.get(id)),customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
