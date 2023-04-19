package storage;

import model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    private ReadWriteFile() {
    }

    private static ReadWriteFile readWriteFile = null;

    public static ReadWriteFile getInstance(){
        if (readWriteFile == null)
            readWriteFile = new ReadWriteFile();
        return readWriteFile;
    }

    //ghi file (1 danh sach)
    // void

    public void writeFile(List<Customer> customers){
        File file = new File("c02.dat");
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(customers);
            oos.close();
            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //doc file (1 list)
    public List<Customer> readFile(){
        File file = new File("c02.dat");
        List<Customer> customers = new ArrayList<>();
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream fis = new ObjectInputStream(is);
            customers =(List<Customer>) fis.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return customers;
    }

    public static void main(String[] args) {
        ReadWriteFile readWriteFile1 = ReadWriteFile.getInstance();
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "ajfh", "ajf"));
        readWriteFile1.writeFile(customers);
    }


}
