package section2.section2_1.section2_1_4.synchronizedMethodLockObject2;

public class ThreadB extends Thread {
    private MyObject object;
    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
