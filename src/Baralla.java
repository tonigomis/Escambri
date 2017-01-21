import java.util.Arrays;

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

    public String toString() {
        return Arrays.toString(cartes);
    }
}
