package section2.section2_2.section2_2_5;

public class ThreadB extends Thread {
    private ObjectService service;
    public ThreadB(ObjectService service) {
        super();
        this.service = service;
    }
    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
