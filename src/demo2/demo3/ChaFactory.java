package demo2.demo3;

public class ChaFactory {
    public Cha getObject(String type){
        Cha a = null;
        switch (type){
            case "T":
                a = new ConTrai();
                break;
            case "G":
                a = new ConGai();
                break;
        }
        return a;
    }
}
