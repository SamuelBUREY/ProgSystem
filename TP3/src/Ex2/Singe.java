package Ex2;


import java.util.Random;
import java.util.concurrent.Callable;

public class Singe implements Callable<Integer> {

    private Casier casier;

    private  int numero;

    public Singe(int numero,Casier casier) {
        this.numero=numero;
        this.casier=casier;
    }

    @Override
    public Integer call() {
        Random ramd = new Random();
        int nb = ramd.nextInt(10);
        for(int i=0; i<nb;i++){
            casier.deposerBanane(new Banane(),numero);
        }
        return nb;
    }
}
