import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

class WaitAndNotifyExample{

    Integer no = new Integer(1);
    
    Object lock = new Object();

    public static void main(String args[]){
        
        WaitAndNotifyExample obj = new WaitAndNotifyExample();

        Runnable evenNumberTask = new Runnable(){
            @Override
            public void run(){
                synchronized(obj.lock){
                    while(obj.no < 19){ //Continuously run
                        if(obj.no % 2 != 0){ //if odd number, then wait. If even number, then print.
                            try{
                                obj.lock.wait();
                            }catch(InterruptedException ex){

                            }
                        }

                        //do task   
                        System.out.println("Even printer "+obj.no);    
                        obj.no++;
                        
                        //notify
                        obj.lock.notify();
                    }   
                } 
            }   
        };

        Runnable oddNumberTask = () -> {


                synchronized(obj.lock){
                    while(obj.no < 19){ //Continuously run
                        if(obj.no % 2 == 0){ //if even number, then wait. if odd number, then print.
                            try{
                                obj.lock.wait();
                            }catch(InterruptedException ex){

                            }
                        }

                        
                        System.out.println("Odd printer "+obj.no);
                        obj.no++;
                        
                        obj.lock.notify();
                    }
                }
        };

        Thread th1 = new Thread(evenNumberTask);
        Thread th2 = new Thread(oddNumberTask);

        th1.start();
        th2.start();

        // List<Runnable> tasks = new ArrayList();
        // ExecutorService executor = Executors.newFixedThreadPool(4);
        // executor.invokeAll(tasks.stream().map(x -> new Callable<V>() {
            
        // }));
    }
}