package section2.section2_2.section2_2_6;

public class MyThread2 extends Thread {
    private Task task;
    public MyThread2 (Task task) {
        super();
        this.task = task;
    }
    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
