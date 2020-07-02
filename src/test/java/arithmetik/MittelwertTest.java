package arithmetik;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class MittelwertTest {

	//Die Tests schlugen fehl als die Grenze von Int eingegeben wurde, weswegen die Berechnung auf (a/2)+(b/2) geändert wurde
	//dabei kam es zu rudnungsfehlern weswegen man auf (double) a/2 + (double) b/2 geändert hat.


	int random= new Random().nextInt(); // Frage ist, ob es klug ist den Wert als Attribut zu machen oder
										// ist es besser im jeden einzelnen Test einen Wert zu initialisieren?
										// Wahrscheinlich ist es egal oder?

	@Test
	void mittelwertVon0und0ist0(){
		int a=0;
		int b=0;
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(a,b)).isEqualTo(0);
	}

	@Test
	void mittelweetvonMinus3und1istMinus1(){
		int a=-3;
		int b=1;
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(a,b)).isEqualTo(-1);
	}

	@Test
	void mittelweetvonMinus2undMinus1istMinus1(){
		int a=-2;
		int b=-1;
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(a,b)).isEqualTo(-1);
	}

	@Test
	void mittelweetvonMinus3undMinus1istMinus2(){
		int a=-3;
		int b=-1;
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(a,b)).isEqualTo(-2);
	}

	@Test
	void mittelwertVonZweiGleichenWertenIstDerSelbeWert(){
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(random,random)).isEqualTo(random);
	}

	@Test
	void mittelwertVonEinemWertUndEinemMinusWertIstGleich0(){
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(random,-random)).isEqualTo(0);
	}

	@Test
	void mittelwertVonEinemMinusWertUndEinemWertIstGleichNull(){
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(-random,random)).isEqualTo(0);
	}

	@Test
	void mittelwertVonEinemMinusWertUndEinemMinusWertIstGleichMinusWert(){
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(-random,-random)).isEqualTo(-random);
	}

	@Test
	void mittelweetvon2147483647und2147483647ist1073741823 (){
		int a=2147483647;
		int b=2147483647;
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(a,b)).isEqualTo(2147483647);
	}

	@Test
	void mittelweetvonMinus2147483647undMinus2147483647ist1073741823 (){
		int a=-2147483647;
		int b=-2147483647;
		Mittelwert i= new Mittelwert();

		assertThat(i.mittelwert(a,b)).isEqualTo(-2147483647);
	}
}
