package section2.section2_2.section2_2_8.test1;

public class Run1_2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();    //使用不同的对象监视器，则异步调用。
        MyObject object2 = new MyObject();
        ThreadA a = new ThreadA(service, object1);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service, object2);
        b.setName("b");
        b.start();
    }
}
