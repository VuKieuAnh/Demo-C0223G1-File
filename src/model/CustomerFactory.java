package model;

public class CustomerFactory  {
    public Customer getObject(String type){
        Customer customer = null;
        switch (type){
            case "V":
                customer = new VIPCustomer();
                break;
            case "N":
                customer = new NormalCustomer();
                break;
        }
        return customer;
    }
}
