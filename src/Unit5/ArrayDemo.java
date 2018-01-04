package Unit5;

public class ArrayDemo {
    public static void main(String[] args) {
        int i;
        int arr[]=new int[5];
        for (i=0;i<arr.length;i++)
            arr[i]=i;
        for (i=0;i<arr.length;i++)
            System.out.println("arr["+i+"]:"+arr[i]);

    }
}
