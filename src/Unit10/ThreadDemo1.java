package Unit10;

import Unit10.CountingThread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        CountingThread thread1=new CountingThread("线程A");
        CountingThread thread2=new CountingThread("线程B");
        thread1.start();
        thread2.start();
    }
}
