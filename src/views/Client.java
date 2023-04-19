package views;

import com.sun.org.apache.bcel.internal.util.ClassStack;
import controller.CustomerManager;
import model.Customer;
import model.CustomerFactory;
import storage.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static List<Customer> c02 = ReadWriteFile.getInstance().readFile();
    private static CustomerManager ka = new CustomerManager("KA",c02);

    public static Customer getNewCustomer(String type){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao id");
        int id = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Moi ban nhap vao name");
        String name = scanner1.nextLine();
        System.out.println("Moi ban nhap vao address");
        Scanner scanner2 = new Scanner(System.in);
        String add = scanner2.nextLine();

        Customer a = null;
        CustomerFactory customerFactory = new CustomerFactory();
        a = customerFactory.getObject("V");
        return a;
    }

    public static int getId(){
        System.out.println("Moi ban nhap vao id can tim kiem");
        int id = (new Scanner(System.in)).nextInt();
        return id;
    }

    public static void main(String[] args) {
        System.out.println(ka.getCustomerList());
        ka.addNewCustomer(getNewCustomer("V"));
        System.out.println(ka.getCustomerList());
        Customer customer =  ka.findById(getId());
    }

}
