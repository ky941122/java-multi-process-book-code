package section2.section2_2.section2_2_9.synTwoLock;

public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}