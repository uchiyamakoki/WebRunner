package Unit10;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new CountingThread2("线程A"));
        Thread t2=new Thread(new CountingThread2("线程B"));
        t1.setPriority(Thread.MAX_PRIORITY);//设置线程A优先级最高,但是只是机会更高
        t1.start();
        t2.start();
    }
}
