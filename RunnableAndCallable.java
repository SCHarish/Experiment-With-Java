import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
public class RunnableAndCallable implements Callable{
    public static void main(String args[]){
        ExecutorService service = Executors.newFixedThreadPool(2);
        RunnableAndCallable obj = new RunnableAndCallable();
        Future<String> result = service.submit(obj);
        try{
            String resultString = result.get();
            System.out.println(resultString);
        }catch(ExecutionException ex){

        } catch(InterruptedException ex1){

            
        }
        AtomicInteger i = new AtomicInteger();
        i.incrementAndGet();
        i.getAndIncrement();
        service.invokeAll(tasks);
        CompletableFuture<String> cp = new CompletableFuture<>();
        cp.thenAccept(()-> System.out.println(""));

        CompletableFuture<Integer> completableFuture
            = CompletableFuture.supplyAsync(() -> 4 );

        CompletableFuture<Integer> future = completableFuture
        .thenApply(s -> s * 4).thenApply(s -> s * 4);



        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.compose(add);

        addThenMultiply.apply(10);

        Runnable task = () -> System.out.println("Hello");

        RunnableAndCallable.FactorialTest callTask = new RunnableAndCallable.FactorialTest();

        Future<Integer> callResult = service.submit(callTask);

        Predicate p = () -> true;
        Predicate.not(p);
        Map<K,V> m = new HashMap();
      
        Future<Integer> f = service.submit(() -> 5);

        try{
           System.out.println("Result from callable "+f.get());
        }catch(InterruptedException ex){

        } catch(ExecutionException ex){

            
        }       

        

       // if(callResult.isDone()){
            int val = 0;
            try{
            val = callResult.get();
            }catch(Exception ex){

            }
            System.out.println("Callable result is "+val);
     //   }

     service.shutdown();

    }

    public String call()throws Exception{
        return "hello";
    }


    static class FactorialTest implements Callable<Integer>{
        @Override 
        public Integer call() throws NullPointerException{
            return 5* 5;
        }
    } 
}
