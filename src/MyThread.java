public class MyThread extends Thread {
    @Override
    public void run() {
        int n=10;
        int dem=0;
        int i=2;
        while(dem<n){
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
