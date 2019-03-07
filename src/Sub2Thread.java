public class Sub2Thread implements Runnable{
    @Override
    public void run() {
       for(int i=10; i>0;i--){
           System.out.println(i);
       }
        try {
            Thread.sleep(10000);
            System.out.println("Chúc mừng");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
