package suspendResumeLockStop;

public class MyThread extends Thread {
    private long i = 0;
    @Override
    public void run() {
        while(true) {
            i++;
            System.out.println(i); // 如果加了这行，Run中的main end就打印不了。
            // 因为运行到println方法内部被suspend时，同步锁未被释放，导致当前PrintStream对象
            // 的println方法一直呈暂停状态，并且锁未释放，则Run的main中的println不能执行。
        }
    }
}
