public class SubThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Running RUN()");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
