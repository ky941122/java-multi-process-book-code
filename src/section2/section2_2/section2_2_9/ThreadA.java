package section2.section2_2.section2_2_9;

public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
