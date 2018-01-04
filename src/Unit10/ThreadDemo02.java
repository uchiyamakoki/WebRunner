package Unit10;

public class ThreadDemo02 {
    public static void main(String[] args) {
        SaleThread st1=new SaleThread(); //实例化对象
        SaleThread st2=new SaleThread();
        SaleThread st3=new SaleThread();
        SaleThread st4=new SaleThread();
        st1.start();
        st2.start();
        st3.start();
        st4.start();
    }
}
