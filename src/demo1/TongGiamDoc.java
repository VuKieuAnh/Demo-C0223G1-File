package demo1;

public class TongGiamDoc {
    private String name;

    private TongGiamDoc() {
    }

    private TongGiamDoc(String name) {
        this.name = name;
    }

    public static TongGiamDoc tongGiamDoc = null;

    public static TongGiamDoc getTongGiamDoc(String name){
        if (tongGiamDoc == null) tongGiamDoc= new TongGiamDoc(name);
        return tongGiamDoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TongGiamDoc{" +
                "name='" + name + '\'' +
                '}';
    }
}
