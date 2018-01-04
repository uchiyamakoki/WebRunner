package Unit10;

public class RunnableDemo02 {
    public static void main(String[] args) {
        SaleThread st=new SaleThread();
        new Thread(st).start();
        new Thread(st).start();
        new Thread(st).start();
    }
}
