package Ex2;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

public class Casier {


    private ArrayBlockingQueue<Banane> bananesCollecte= new ArrayBlockingQueue<Banane>(100);

    private ArrayList<Integer> bananesCollectee;

    public Casier(int nbSinge){
        bananesCollectee=new ArrayList<>();
        for(int i=0;i<nbSinge;i++){
            bananesCollectee.add(0);
        }
    }


    public synchronized  int getBananeCollectee(){
        return bananesCollecte.remainingCapacity();
    }




    public void getBananesCollecteeSinge(int numero){

    }

    public void deposerBanane(Banane ban, int numero){
        bananesCollectee.set(numero, bananesCollectee.get(numero) + 1);
        try {
            bananesCollecte.put(ban);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
