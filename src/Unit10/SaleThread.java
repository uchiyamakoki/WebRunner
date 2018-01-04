package Unit10;

public class SaleThread extends Thread{
    private int ticket=5; //一共有5张票
    public void run(){ //复写run方法，作为线程的操作主体
        for (int i=0;i<100;i++){
            if (this.ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖票：ticket="+ticket--);//卖出一张票++++
            }
        }
    }
}
