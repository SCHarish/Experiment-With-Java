public class VolatileTest {
    private  volatile  int q = 0;

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTest volatileTest = new VolatileTest();
        new Thread(()->{
            while (volatileTest.getQ()==0){
            //With this one, it will jump out Looping... Remove the endless loop
                System.out.println();
            }
        }).start();
        Thread.sleep(1000);
        volatileTest.setQ(1);
        System.out.println(volatileTest.getQ());
    }
}