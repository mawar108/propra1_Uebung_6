package logik;

import org.junit.jupiter.api.Test;

import static logik.Junktoren.*;
import static org.assertj.core.api.Assertions.assertThat;

public class JunktorenTest {

	@Test
	void nandVonWahrUndWahrIstFalsch() {
		Wahrheitswert a = nand(Wahrheitswert.WAHR, Wahrheitswert.WAHR);

		assertThat(a).isEqualTo(Wahrheitswert.FALSCH);
	}

	@Test
	void nandVonWahrUndFalschIstWahr() {
		Wahrheitswert a = nand(Wahrheitswert.WAHR, Wahrheitswert.FALSCH);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}

	@Test
	void nandVonFalschUndWahrIstWahr() {
		Wahrheitswert a = nand(Wahrheitswert.FALSCH, Wahrheitswert.WAHR);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}

	@Test
	void nandVonFalschUndFalschIstWahr() {
		Wahrheitswert a = nand(Wahrheitswert.FALSCH, Wahrheitswert.FALSCH);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}

	@Test
	void andVonWahrUndWahrIstWahr() {
		Wahrheitswert a = and(Wahrheitswert.WAHR, Wahrheitswert.WAHR);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}

	@Test
	void andVonWahrUndFalschIstFalsch() {
		Wahrheitswert a = and(Wahrheitswert.WAHR, Wahrheitswert.FALSCH);

		assertThat(a).isEqualTo(Wahrheitswert.FALSCH);
	}

	@Test
	void andVonFalschUndWahrIstFalsch() {
		Wahrheitswert a = and(Wahrheitswert.FALSCH, Wahrheitswert.WAHR);

		assertThat(a).isEqualTo(Wahrheitswert.FALSCH);
	}

	@Test
	void andVonFalschUndFalschIstFalsch() {
		Wahrheitswert a = and(Wahrheitswert.FALSCH, Wahrheitswert.FALSCH);

		assertThat(a).isEqualTo(Wahrheitswert.FALSCH);
	}


	@Test
	void notVonWahrIstFalsch() {
		Wahrheitswert a = not(Wahrheitswert.WAHR);

		assertThat(a).isEqualTo(Wahrheitswert.FALSCH);
	}

	@Test
	void notVonFalschIstWahr() {
		Wahrheitswert a = not(Wahrheitswert.FALSCH);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}


	@Test
	void orVonWahrUndWahrIstWahr() {
		Wahrheitswert a = or(Wahrheitswert.WAHR, Wahrheitswert.WAHR);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}

	@Test
	void orVonWahrUndFalschIstWahr() {
		Wahrheitswert a = or(Wahrheitswert.WAHR, Wahrheitswert.FALSCH);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}

	@Test
	void orVonFalschUndWahrIstWahr() {
		Wahrheitswert a = or(Wahrheitswert.FALSCH, Wahrheitswert.WAHR);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}

	@Test
	void orVonFalschUndFalschIstFalsch() {
		Wahrheitswert a = or(Wahrheitswert.FALSCH, Wahrheitswert.FALSCH);

		assertThat(a).isEqualTo(Wahrheitswert.FALSCH);
	}


	@Test
	void impliesVonWahrUndWahrIstWahr() {
		Wahrheitswert a = implies(Wahrheitswert.WAHR, Wahrheitswert.WAHR);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}

	@Test
	void impliesVonWahrUndFalschIstFalsch() {
		Wahrheitswert a = implies(Wahrheitswert.WAHR, Wahrheitswert.FALSCH);

		assertThat(a).isEqualTo(Wahrheitswert.FALSCH);
	}

	@Test
	void impliesVonFalschUndWahrIstWahr() {
		Wahrheitswert a = implies(Wahrheitswert.FALSCH, Wahrheitswert.WAHR);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}

	@Test
	void impliesVonFalschUndFalschIstWahr() {
		Wahrheitswert a = implies(Wahrheitswert.FALSCH, Wahrheitswert.FALSCH);

		assertThat(a).isEqualTo(Wahrheitswert.WAHR);
	}


}