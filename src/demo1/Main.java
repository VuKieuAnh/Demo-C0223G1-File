package demo1;

public class Main {
    public static void main(String[] args) {
//        TongGiamDoc a = new TongGiamDoc("A");
//        TongGiamDoc b = new TongGiamDoc("B");
        TongGiamDoc a = TongGiamDoc.getTongGiamDoc("A");
        TongGiamDoc b = TongGiamDoc.getTongGiamDoc("B");
        System.out.println(a);
        System.out.println(b);
    }
}
