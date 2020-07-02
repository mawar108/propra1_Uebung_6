package diehard;

import java.io.PrintStream;

public class DieHardSale {


    public static void printSumme(PrintStream out, Warenkorb warenkorb) {

        out.println("Der Preis beträgt "+ warenkorb.berecheneBestenPreis()+"€ .");
    }


}
