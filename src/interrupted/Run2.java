package interrupted;

public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？=" + Thread.interrupted());
        System.out.println("是否停止2？=" + Thread.interrupted());
        //interrupted方法具有清除状态的功能，所以第二次调用返回的是false.
        System.out.println("end!");
    }
}
