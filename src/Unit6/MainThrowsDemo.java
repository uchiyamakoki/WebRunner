package Unit6;

public class MainThrowsDemo {
    public static void main(String[] args) throws Exception{
        Math m=new Math();
        System.out.println("除法操作："+m.div(5,0));
    }
}
