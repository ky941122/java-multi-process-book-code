package section2.section2_2.section2_2_6;

public class Task {
    synchronized public void otherMethod() {
        System.out.println("--------------------------------run--otherMethod");
    }
    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName= "
                        + Thread.currentThread().getName()
                + " i= " + (i+1));
            }
        }
    }
}
