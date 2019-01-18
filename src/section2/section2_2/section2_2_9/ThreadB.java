package section2.section2_2.section2_2_9;

public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}
