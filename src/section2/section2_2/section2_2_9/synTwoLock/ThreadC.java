package section2.section2_2.section2_2_9.synTwoLock;

public class ThreadC extends Thread {
    private Service service;
    public ThreadC(Service service) {
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.printC();
    }
}
