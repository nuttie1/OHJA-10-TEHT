package kps_testit;
import kivipaperisakset.Pelaaja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PelaajaTest {
	
	private Pelaaja pelaaja;
    
    @Before
    public void setUp() {
        pelaaja = new Pelaaja();
    }
    
    @Test
    public void testPelaajanValintaReturnsValidValue() {
        String valinta = pelaaja.pelaajanValinta();
        assertTrue(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
    }
    
    @Test
    public void testVoittojenMaara() {
        assertEquals(0, pelaaja.getVoitot());
        pelaaja.setVoitot();
        assertEquals(1, pelaaja.getVoitot());
        pelaaja.setVoitot();
        assertEquals(2, pelaaja.getVoitot());
    }
}

