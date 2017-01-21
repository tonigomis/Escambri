/**
 * Created by toni on 18/01/17.
 */
public class Carta {
    enum TColl {
        ORS, ESPASES, BASTOS, COPES
    }

    enum TnomCarta {
        DOS, QUATRE, CINC, SIS, SET, SOTA, CAVALL, REI, TRES, AS
    }

    TColl coll;
    TnomCarta carta;

    Carta(TnomCarta carta, TColl coll) {
        this.carta = carta;
        this.coll = coll;
    }

    public String toString() {
        return this.carta.toString() + " de " + this.coll.toString();
    }
}
