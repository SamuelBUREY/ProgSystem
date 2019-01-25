package Ex1;

import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.*;

public class GetStatus {
    private String[] hostList = {"http://crunchify.com", "http://yahoo.com",
            "http://www.ebay.com", "http://google.com",
            "http://www.example.co", "https://paypal.com",
            "http://bing.com/", "http://techcrunch.com/",
            "http://mashable.com/", "http://thenextweb.com/",
            "http://wordpress.com/", "http://wordpress.org/",
            "http://example.com/", "http://sjsu.edu/",
            "http://ebay.co.uk/", "http://google.co.uk/",
            "http://www.wikipedia.org/",
            "http://en.wikipedia.org/wiki/Main_Page"};

    private int nbthreads;

    private ExecutorService executor;

    public GetStatus() {
        this.nbthreads = hostList.length;
        executor = Executors.newFixedThreadPool(nbthreads);
    }


    public void executePool() {
        Collection<Future<?>> futures = new LinkedList<>();
        for (int i = 0; i < nbthreads; i++) {
            futures.add(executor.submit(new WebVerif(hostList[i])));
        }
        for (Future<?> future : futures) {
            try {
                future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Pool finie");

    }
}
