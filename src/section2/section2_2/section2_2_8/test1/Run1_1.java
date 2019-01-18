package section2.section2_2.section2_2_8.test1;

public class Run1_1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();   //使用同一个对象监视器，所以会是同步的。
        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service, object);
        b.setName("b");
        b.start();
    }
}
