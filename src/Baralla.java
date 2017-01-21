import java.util.Arrays;
import java.util.Random;

/**
 * Created by toni on 18/01/17.
 */
public class Baralla {
    Carta[] cartes = new Carta[48];
    
    public Baralla() {
        Carta.TColl[] TColl = Carta.TColl.values();
        Carta.TnomCarta[] TnomCarta = Carta.TnomCarta.values();
        int pos = 0;
        for (Carta.TColl aTColl : TColl) {
            for (Carta.TnomCarta aTnomCarta : TnomCarta) {
                cartes[pos++] = new Carta(aTnomCarta, aTColl);
            }
        }
    }

    void mescla() {
        int l = cartes.length;
        Random r = new Random();
        for (int i = l - 1; i >= 1 ; i--) {
            int k = r.nextInt(i + 1);
            Carta c = cartes[k];
            cartes[k] = cartes[i];
            cartes[i] = c;
        }
    }

    public String toString() {
        return Arrays.toString(cartes);
    }
}
