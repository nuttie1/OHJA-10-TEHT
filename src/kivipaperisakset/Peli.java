package kivipaperisakset;

/**
 * @brief Peli on kivi paperi sakset peli, jossa pelataan kunnes jompi kumpi 
 * kahdesta pelaajasta saa kolme voittoa täyteen.
 * 
 * Pelissä kivi paperi tai sakset arvotaan satunnaisesti joka kierroksella. Tasapelit eivät lisää voittoja.
 * 
 * @author Ira Dook and Otto
 */
public class Peli {

    public static void main(String args[]) {
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        int pelatutPelit = 0;           // Pelattujen pelien lkm
        int tasapelit = 0;              // Tasapelien lkm
        String p1Valinta, p2Valinta;
       
        // Pelataan peliä kunnes jompikumpi pelaaja on saanut yhteensä 3 voittoa.
        while (p1.getVoitot() < 3 && p2.getVoitot() < 3){
            System.out.println("Erä: " + pelatutPelit + " =====================\n");
            System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");
            p1Valinta = p1.pelaajanValinta();
            System.out.println("Pelaaja 1: " + p1Valinta + "\n\t Pelaaja 1:llä koossa " + p1.getVoitot() + " voittoa.");
            p2Valinta = p2.pelaajanValinta();
            System.out.println("Pelaaja 2: " + p2Valinta + "\n\t Pelaaja 2:lla koossa " + p2.getVoitot() + " voittoa.");
            
            pelatutPelit++;
            
            // Tarkistetaan onko peli tasapeli ennekuin tarkistetaan muuta.
            if(tasaPeliTarkistus(p1Valinta,p2Valinta)) {
                System.out.println("\n\t\t\t Tasapeli \n");
            	continue;
            }

            
            // Tarkistetaan kivi paperi sakset pelin voittaja.
            if(tarkistus(p1Valinta,p2Valinta).equals("p1")) {
                System.out.println("Pelaaja 1 voittaa");
            	p1.setVoitot();
            } else {
                System.out.println("Pelaaja 2 voittaa");
            	p2.setVoitot();
            }
        } 
        System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
        System.out.println(p1.getVoitot() + " -- " + p2.getVoitot());

    }
    /**
     * @brief Tarkistaa onko annetut merkkijonot samanlaiset vai ei.
     * @param valinta1 Ykkös pelaajan valinta. (Sakset, kivi tai peperi)
     * @param valinta2 Kakkos pelaajan valinta. (Sakset, kivi tai peperi)
     * @return boolean true jos valinnat ovat samat. False jos ne ovat eri
     */
    public static boolean tasaPeliTarkistus(String valinta1, String valinta2) {
    	return valinta1.equals(valinta2);         
    }

    /**
     * @brief Tarkistaa kumpi syötteistä voittaa. Palauttaa voittajan merkkijonon.
     * @param valinta1 Ykkös pelaajan valinta. (sakset, kivi tai paperi)
     * @param valinta2 Kakkos pelaajan valinta. (sakset, kivi tai paperi)
     * @return p1 tai p2 Kumpi on voittanut pelin
     */
    public static String tarkistus(String valinta1, String valinta2) {
    	switch(valinta1) {
    		case "kivi":
    			return valinta2.equals("sakset") ? "p1" : "p2";
    		case "paperi":
    			return valinta2.equals("kivi") ? "p1" : "p2";
    		case "sakset":
    			return valinta2.equals("paperi") ? "p1" : "p2";
    	}
    	return "Not supposed to happen!";
    }
   
}
