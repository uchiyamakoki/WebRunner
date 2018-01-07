package Unit10;

import java.applet.Applet;
import java.awt.*;

public class ThreadSleepDemo extends Applet implements Runnable{
    int x=0;
    Thread Scrollwords;
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
        setFont(new Font("TimesRoman",Font.BOLD,18));
    }
    public void start(){
        if (Scrollwords==null){
            Scrollwords=new Thread(this);
            Scrollwords.start();
        }
    }
    public void run(){
        while (Scrollwords!=null){
            x=x+5;
            if (x>500) x=0;
            repaint();
            try {
                Scrollwords.sleep(80);
            }catch (InterruptedException e){ }
        }
    }
    public void paint(Graphics g){
        g.drawString("欢迎学习Java多线程!",x,80);
    }
    public void stop(){
        Scrollwords.yield();
        Scrollwords=null;
    }
}
