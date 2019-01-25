package Ex2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

public class Casier  {


    private ArrayBlockingQueue<Banane> bananesCollecte= new ArrayBlockingQueue<Banane>(100);


    public synchronized  int getBananeCollectee(){
        return bananesCollecte.size();
    }

}
