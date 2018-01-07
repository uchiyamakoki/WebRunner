package AppletDemo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleBrowserDemo extends Applet implements ActionListener {
    Button buttonBrowser;// 浏览按钮
    URL url; // URL类对象url
    TextField textURL;// TextField类对象textURL

    public SimpleBrowserDemo() {
        this.setBackground(Color.yellow);
        buttonBrowser = new Button("浏览"); // 创建“游览”按钮
        textURL = new TextField(20); // 创建URL地址栏输入框
        add(new Label("输入网址：")); // 创建标签并加入applet页面中
        add(textURL); // 将按钮及地址栏输入框加入到applet页面中
        add(buttonBrowser);
        buttonBrowser.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) { // 单击按钮事件处理
        String s = textURL.getText().trim();
        if (e.getSource() == buttonBrowser) {
            try {// 创建URL类的对象url
                url = new URL(s);
            } catch (MalformedURLException me) {
                textURL.setText("不正确的网址：" + s);
            }

            getAppletContext().showDocument(url);
// 利用浏览器浏览网页
        }
    }
}


