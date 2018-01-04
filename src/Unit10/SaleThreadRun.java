package Unit10;

public class SaleThreadRun implements Runnable{
    private int ticket=5;

    public void run() {
    for (int i=0;i<100;i++){
        if (this.ticket>0){
            System.out.println(Thread.currentThread().getName()+"买票：ticket="+ticket--);//卖出一张票
        }
    }
    }
}
