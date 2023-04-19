package model;

import java.io.Serializable;

public class NormalCustomer extends Customer implements Serializable {
    NormalCustomer() {
    }

    @Override
    public String toString() {
        return "NormalCustomer{}";
    }
}
