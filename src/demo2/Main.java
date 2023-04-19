package demo2;

import demo2.demo3.Cha;
import demo2.demo3.ChaFactory;
import demo2.demo3.ConGai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChaFactory c = new ChaFactory();
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        Cha c1 = c.getObject(a);
        System.out.println(c1);

//        ConGai c2 = new ConGai();

    }
}
