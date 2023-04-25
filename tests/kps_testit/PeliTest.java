package kps_testit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import kivipaperisakset.Peli;

class PeliTest {

	@Test
    public void testTasaPeliTarkistus() {
        assertTrue(Peli.tasaPeliTarkistus("kivi", "kivi"));
        assertTrue(Peli.tasaPeliTarkistus("paperi", "paperi"));
        assertTrue(Peli.tasaPeliTarkistus("sakset", "sakset"));
        assertFalse(Peli.tasaPeliTarkistus("kivi", "paperi"));
        assertFalse(Peli.tasaPeliTarkistus("paperi", "sakset"));
        assertFalse(Peli.tasaPeliTarkistus("sakset", "kivi"));
    }
    
    @Test
    public void testTarkistus() {
        assertEquals("p1", Peli.tarkistus("kivi", "sakset"));
        assertEquals("p2", Peli.tarkistus("kivi", "paperi"));
        assertEquals("p1", Peli.tarkistus("paperi", "kivi"));
        assertEquals("p2", Peli.tarkistus("paperi", "sakset"));
        assertEquals("p1", Peli.tarkistus("sakset", "paperi"));
        assertEquals("p2", Peli.tarkistus("sakset", "kivi"));
        
    }
    
}
