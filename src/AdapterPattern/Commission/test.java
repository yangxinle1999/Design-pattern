package AdapterPattern.Commission;

public class test {
    public static void main(String[] args) {
        Adapte adapte=new Adapte(new use220V());
        adapte.use18V();
    }
}
