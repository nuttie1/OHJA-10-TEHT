
package kivipaperisakset;

/**
 * @brief Pelaaja luokka jossa voidaan satunnasiesti kiven, paperin tai sakset ja kerätä voittoja.
 * 
 * @author Ira Dook and Otto palssa
 */
public class Pelaaja {
    int voitot;      // Voittojen lukumäärä

    /**
     * @Brief Arpoo satunnaisesti kivi, paperin tai sakset merkkijonon.
     * @return merkkijono valinta
     */
    public String pelaajanValinta() {
        String valinta = "";
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                valinta = ("kivi");
                break;
            case 1:
                valinta = ("paperi");
                break;
            case 2:
                valinta = ("sakset");
                break;
        }
        return valinta;
    }
    
    /**
 	* @brief Palauttaa kerätyt voitot
 	* @return int voittojen määrä
 	*/
    public int getVoitot() {
        return voitot;
    }
    
    /**
     * @brief Lisää pelaajan voittoja yhdellä.
     */
    public void setVoitot() {
        this.voitot++;
    }
}
