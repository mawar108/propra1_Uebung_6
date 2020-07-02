package diehard;

public class Main {

    public static void main(String[] args) {
      Warenkorb wk = Warenkorb.create(1,2,3,4,5);
      DieHardSale.printSumme(System.out, wk); // Ausgabe: 8.00
    }


}
