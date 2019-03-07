public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Using runable
        Sub2Thread sub2Thread = new Sub2Thread();
        Thread thread = new Thread(sub2Thread);
        thread.start();
    }
}
