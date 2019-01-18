package section2.section2_2.section2_2_2;

public class ThreadA extends Thread {
    private ObjectService service;
    public ThreadA(ObjectService service) {
        super();
        this.service = service;
    }
    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
