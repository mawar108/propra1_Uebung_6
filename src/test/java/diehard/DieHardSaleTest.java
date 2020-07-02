package diehard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class DieHardSaleTest {


	@Test
	public void konstruktorTester(){
		Warenkorb warenkorb= new Warenkorb(1,2,3,4,5);
		ArrayList<Integer> soll= new ArrayList<>();
		soll.add(0,1); soll.add(1,2); soll.add(2,3); soll.add(3,4); soll.add(4,5);
		assertThat(warenkorb.getWarenkorb()).isEqualTo(soll);
	}

	@Test
	public void berechneGuenstigstenPreis0(){
		Warenkorb warenkorb= new Warenkorb(0,0,0,0,0);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(0.00);
	}


	@Test
	public void berechneGuenstigstenPreis(){
		Warenkorb warenkorb= new Warenkorb(1,0,0,0,0);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(8.00);
	}

	@Test
	public void berechneGuenstigstenPreis2(){
		Warenkorb warenkorb= new Warenkorb(1,1,0,0,0);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(15.20);
	}

	@Test
	public void berechneGuenstigstenPreis3(){
		Warenkorb warenkorb= new Warenkorb(1,1,1,0,0);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(21.60);
	}

	@Test
	public void berechneGuenstigstenPreis4(){
		Warenkorb warenkorb= new Warenkorb(1,1,0,1,1);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(25.60);
	}

	@Test
	public void berechneGuenstigstenPreis5(){
		Warenkorb warenkorb= new Warenkorb(1,1,1,1,1);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(30.00);
	}

	@Test
	public void berechneGuenstigstenPreis6(){
		Warenkorb warenkorb= new Warenkorb(1, 2,3,4,5);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(100.00);
	}


	@Test
	public void berechneGuenstigstenPreis7(){
		Warenkorb warenkorb= new Warenkorb(2, 2, 2,1,1);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(51.2);
	}

	@Test
	public void berechneGuenstigstenPreis8(){
		Warenkorb warenkorb= new Warenkorb(3, 3, 3, 2, 2);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(81.2);
	}

	@Test
	public void berechneGuenstigstenPreis9(){
		Warenkorb warenkorb= new Warenkorb(5, 5, 4, 5, 4);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(141.2);
	}

	@Test
	public void berechneGuenstigstenPreis10(){
		Warenkorb warenkorb= new Warenkorb(3, 2, 4, 2, 1);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(78.8);
	}

	@Test
	public void berechneGuenstigstenPreis11(){
		Warenkorb warenkorb= new Warenkorb(3, 4, 3, 6, 6);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(141.6);
	}

	@Test
	public void berechneGuenstigstenPreis12(){
		Warenkorb warenkorb= new Warenkorb(3, 4, 3, 6,0);
		assertThat(warenkorb.berecheneBestenPreis()).isEqualTo(108);
	}
}
