package arithmetik;

import java.util.List;

public class Summe {


    public static Long summe(List<Long> summanden) {
        Long result = 0L;
        for (int i = 0; i < summanden.size(); i++) {
            result += summanden.get(i);
        }
        return result;
    }


}
