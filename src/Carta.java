/**
 * Created by toni on 18/01/17.
 */
public class Carta {
    enum TColl {
        ORS, ESPASES, BASTOS, COPES
    }

    enum TnomCarta {
        DOS, QUATRE, CINC, SIS, SET, VUIT, NOU, SOTA, CAVALL, REI, TRES, AS
    }

    TColl coll;
    TnomCarta carta;

    Carta(TnomCarta carta, TColl coll) {
        this.carta = carta;
        this.coll = coll;
    }

    public String toString() {
        if (this.coll == TColl.ORS || this.coll == TColl.ESPASES) {
            return  "\n" + this.carta.toString() + " d'" + this.coll.toString();
        } else {
            return "\n" + this.carta.toString() + " de " + this.coll.toString();
        }
    }
}
