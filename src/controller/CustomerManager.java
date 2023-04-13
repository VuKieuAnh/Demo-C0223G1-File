package controller;

import model.Customer;
import storage.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {

    private String name;

    private List<Customer> customerList = new ArrayList<>();

    public void addNewCustomer(Customer customer){
        customerList.add(customer);
        ReadWriteFile.writeFile(customerList);
    }

    public Customer findById(int id){
        for (int i = 0; i < customerList.size(); i++) {
            if (id == customerList.get(i).getId())
                return customerList.get(i);
        }
        return null;
    }



    public CustomerManager() {
    }


    public CustomerManager(String name, List<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }

    public CustomerManager(String name) {
        this.name = name;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
