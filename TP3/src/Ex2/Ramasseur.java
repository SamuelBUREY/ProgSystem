package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Ramasseur {


    private Integer numberOfBananasCollected = 0;
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);


    public void ramasser(){


        List<Future<Integer>> list = new ArrayList<Future<Integer>>();
        Casier casier = new Casier(10);

        for(int i=0; i< 10; i++){

            Future<Integer> future = executorService.submit(new Singe(i,casier));

            list.add(future);
        }
        for(Future<Integer> fut : list){
            try {
                numberOfBananasCollected+=fut.get();
                System.out.println("Nombre de bananes ramassée : "+numberOfBananasCollected);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Nombre de bananes ramassée total : "+ numberOfBananasCollected);

        executorService.shutdown();
    }

}
