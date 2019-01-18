package priority;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Mythread2 run priority=" + this.getPriority());
    }
}
