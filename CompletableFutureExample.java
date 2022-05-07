import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String args[]){
        CompletableFuture cFuture = CompletableFuture.supplyAsync( () -> {
            return "harish";
        });

        cFuture.thenAccept((x) -> System.out.println(x));


        
    }
}
