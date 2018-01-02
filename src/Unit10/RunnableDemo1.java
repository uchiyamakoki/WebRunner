package Unit10;

public class RunnableDemo1 {
    public static void main(String[] args) {
        CountingThread1 ct1=new CountingThread1("线程A：");
        CountingThread1 ct2=new CountingThread1("线程B：");
        Thread thread1=new Thread(ct1);
        Thread thread2=new Thread(ct2);
        thread1.start();
        thread2.start();

    }
}
