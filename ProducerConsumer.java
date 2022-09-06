import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ProducerConsumer {

    int counter = 0;
    boolean readToConsume = false;
  
    public static void main(String[] args){
        Object lock = new Object();
        ProducerConsumer lockObj = new ProducerConsumer();

        ExecutorService myExecutor = Executors.newFixedThreadPool(3);
        

        
        
        Runnable producer = () -> {

            while(lockObj.counter < 100){
                synchronized(lock){
                    while(lockObj.readToConsume){
                    
                            try{
                                lock.wait();
                            }catch(InterruptedException ex){

                            }
                    
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    lockObj.counter++;
                    System.out.println("Produced counter "+lockObj.counter);
                    lockObj.readToConsume = true;
                    lock.notify();
                }
            }
        };

            Runnable consumer = () -> {

                while(lockObj.counter < 100){
                synchronized(lock){
                    while(!lockObj.readToConsume){
                
                            try{
                                lock.wait();
                            }catch(InterruptedException ex){
                                
                            }
                        
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("Consumed counter "+lockObj.counter);
                    lockObj.readToConsume = false; //as already consumed
                    lock.notify();
                }
            }
            
        };

        // Thread th1 = new Thread(producer);
        // Thread th2 = new Thread(consumer);
        // th1.start();
        // th2.start();
        myExecutor.submit(producer);
        Future f = myExecutor.submit(consumer);
       
        myExecutor.shutdown();
        myExecutor.awaitTermination(3, TimeUnit.MICROSECONDS);
    }

}
