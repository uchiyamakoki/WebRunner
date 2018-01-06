package Unit10;

public class CountingThread2 implements Runnable {
    private String name;
    public CountingThread2(String name){
        this.name=name;
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(name+"运行："+i);
        }
    }
}
