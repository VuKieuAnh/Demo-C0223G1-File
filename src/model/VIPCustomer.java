package model;

import java.io.Serializable;

public class VIPCustomer extends Customer implements Serializable {
    VIPCustomer() {
    }

    @Override
    public String toString() {
        return "VIPCustomer{}";
    }
}
