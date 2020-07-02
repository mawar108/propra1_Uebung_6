package arithmetik;

import java.math.BigInteger;
import java.util.List;

public class Summe {


    public static Double summe(List<Long> summanden) {
        Double result = (double) 0;
        for (int i = 0; i < summanden.size(); i++) {
            result += summanden.get(i);
        }
        return result;
    }


}
