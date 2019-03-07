public class Main {
    public static void main(String[] args) {

        System.out.println("Thread mainnnn "+Thread.currentThread());
        for(int i=0;i<10;i++){
            System.out.println("myJavaThread ");
        }
        MyThread thread = new MyThread();
        thread.start();
    }
}
