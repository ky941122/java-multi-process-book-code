package section2.section2_2.section2_2_7.syn_Out_asyn;

public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        MyThreadA a = new MyThreadA(myList);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(myList);
        b.setName("B");
        b.start();
    }
}
