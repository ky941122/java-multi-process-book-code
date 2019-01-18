package section2.section2_2.section2_2_9.synBlockMoreObjectOneLock;

public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.printA();
    }
}
