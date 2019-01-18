package section2.section2_2.section2_2_7.synBlockString2;

public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
    }
}
