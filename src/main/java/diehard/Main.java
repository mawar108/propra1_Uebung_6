package diehard;

public class Main {

    public static void main(String[] args) {
      Warenkorb wk = Warenkorb.create(1,0,0,0,0);
      DieHardSale.printSumme(System.out, wk); // Ausgabe: 8.00
    }


}
