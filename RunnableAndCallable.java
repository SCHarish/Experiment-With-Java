import java.util.concurrent.*;
public class RunnableAndCallable implements Callable{
    public static void main(String args[]){
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> result = service.submit(new RunnableAndCallable());
        try{
            String resultString = result.get();
            System.out.println(resultString);
        }catch(ExecutionException ex){

        } catch(InterruptedException ex1){

        }

    }

    public String call()throws Exception{
        return "hello";
    }


}
