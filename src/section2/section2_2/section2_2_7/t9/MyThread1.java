package section2.section2_2.section2_2_7.t9;

public class MyThread1 extends Thread {
    private MyOneList list;
    public MyThread1(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "A");
    }
}
