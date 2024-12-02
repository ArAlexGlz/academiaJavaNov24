package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinMockitoTest {

	@Test
	void test() {
		
		CalculoFinancieroCloud cfc = null; //<=PROBLEMA
		
		//cfc = new CalculoFinancieroPropiedad();
		
		//CLASE ANONIMA
//		CalculoFinancieroCloud cfc = new CalculoFinancieroCloud() {
//			public double ejecutaOperacionCompleja(long l, float f, int i, byte b) {
//				return 123.45;
//			}
//		};
		
		CalculoFinanciero cf = new CalculoFinanciero(cfc);
		
		double res = cf.ejecuta(8888, 2.3f, 4, (byte)1);
		
		assertEquals(3701.57696088516, res);
		
	}

}

