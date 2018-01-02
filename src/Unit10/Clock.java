package Unit10;

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class Clock extends Applet implements Runnable{
    Thread clockThread;
    //Applet的start方法
    public void start(){
        if (clockThread==null){
            clockThread=new Thread(this);
            clockThread.start(); //线程启动
        }
    }
    //覆盖run（）方法，实现多线程
    public void run(){
        while (clockThread!=null){
            repaint();
            try{
                clockThread.sleep(1000); //每隔1s刷新一次时间
            }catch (InterruptedException e){ }
        }
    }
    //Applet的paint（）方法
    public void paint(Graphics g){
        Date now=new Date();
        g.drawString("当前时间："+now.getHours()+"："+now.getMinutes()+"："+now.getSeconds(),25,30);
    }
    //Applet的stop（）方法
    public void stop(){
        clockThread.stop();
        clockThread=null;
    }
}
