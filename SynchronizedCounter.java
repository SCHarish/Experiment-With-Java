
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
public class SynchronizedCounter implements Runnable{

    static int counter = 0;
    static Object lock = new Object();

    static AtomicInteger atomicInt = new AtomicInteger();
    public static void main(String args[]){
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        for(int i=0;i<105;i++)
            executorService.submit(new SynchronizedCounter());
    }

    public void run(){
        synchronized(lock){
            counter++;
           // System.out.println("Counter value is "+counter);
        }


        
        System.out.println("atomicInt "+atomicInt.getAndIncrement());
    }

}
