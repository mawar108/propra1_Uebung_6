package logik;

import static logik.Wahrheitswert.FALSCH;
import static logik.Wahrheitswert.WAHR;

public class Junktoren {

    public static Wahrheitswert nand(Wahrheitswert a, Wahrheitswert b) {
        if (a == WAHR & b == WAHR) {
            return FALSCH;
        }
        return WAHR;
    }

    public static Wahrheitswert not(Wahrheitswert a) {
        return nand(a, a);
    }

    public static Wahrheitswert and(Wahrheitswert a, Wahrheitswert b) {
        return nand(nand(a, b), nand(a, b));
    }

    public static Wahrheitswert or(Wahrheitswert a, Wahrheitswert b) {
        return nand(nand(a, a), nand(b, b));
    }

    public static Wahrheitswert implies(Wahrheitswert a, Wahrheitswert b) {
        return nand(nand(nand(a, a), nand(a, a)), nand(b, b));
    }

}
