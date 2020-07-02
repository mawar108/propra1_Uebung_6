package arithmetik;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static arithmetik.Summe.summe;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummeTest {

	//nicht fertig, da keine wirkliche Lösung zu finden ist, mit der ich zu frieden wäre.


	@Test
	void sumVonNichtsIst0() {
		List<Long> zahlen = Arrays.asList();
		Double ergebnis = summe(zahlen);
		assertThat(ergebnis).isEqualTo(0);
	}


	@Test
	void sumVon0ist0() {
		List<Long> zahlen = Arrays.asList(0L);
		Double ergebnis = summe(zahlen);
		assertThat(ergebnis).isEqualTo(0);
	}


	@Test
	void sumVon1und1ist2() {
		List<Long> zahlen = Arrays.asList(1L, 1L);
		Double ergebnis = summe(zahlen);
		assertThat(ergebnis).isEqualTo(2);
	}


	@Test
	void sumVon1undMinus1ist0() {
		List<Long> zahlen = Arrays.asList(1L, -1L);
		Double ergebnis = summe(zahlen);
		assertThat(ergebnis).isEqualTo(0);
	}

	@Test
	void sumVonMinus1undMinus1istMinus2() {
		List<Long> zahlen = Arrays.asList(-1L, -1L);
		Double ergebnis = summe(zahlen);
		assertThat(ergebnis).isEqualTo(-2);
	}

	@Test
	void sumVonSehrGrossenZahlen() {
		List<Long> zahlen = Arrays.asList(Long.MAX_VALUE, 2L);
		Double ergebnis = summe(zahlen);
		Double a= (double) Long.MAX_VALUE;
		assertThat(ergebnis).isEqualTo(a+2L);

	}
}