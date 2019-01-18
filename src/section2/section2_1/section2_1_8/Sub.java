package section2.section2_1.section2_1_8;

public class Sub extends Main {
    @Override
    synchronized public void serviceMethod() {
        try {
            System.out.println("int sub next step sleep begin threadname= "
            + Thread.currentThread().getName() + " time= " + System.currentTimeMillis());

            Thread.sleep(5000);
            System.out.println("int sub next step sleep end threadName= "
            + Thread.currentThread().getName() + " time= " + System.currentTimeMillis());

            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
