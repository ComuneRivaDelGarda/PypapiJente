/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.axiastudio.pypapi.plugins.jente.JEnteHelper;
import com.axiastudio.pypapi.plugins.jente.webservices.Movimento;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author AXIA Studio (http://www.axiastudio.com)
 */
public class JEnteJUnitTest {
    
    private static final String NUMERO = "8399";
    private static final String ORGANO = "DT";
    private static final String ANNO = "2012";
    private static final String RESPONSABILE = "0180";
    private static final String DATAATTOOBOZZA = "31/12/2012";
    private static final String VALIDOIMPEGNI = "S";
    private static final String VALIDOACCERTAMENTI = "N";

    private JEnteHelper jEnteHelper;
    
    public JEnteJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.jEnteHelper = new JEnteHelper("JENTE");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testRichiestaEsisteBozzaOAtto() {

        // se non esiste lo creo, e poi verifico che effettivamente esista
        if( !this.jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("A", ORGANO, ANNO, NUMERO) ){
            this.jEnteHelper.chiamataRichiestaInserimentoBozzaOAtto("A", ORGANO, ANNO, NUMERO,
                    "Inserimento automatico provvadimento", RESPONSABILE, DATAATTOOBOZZA, VALIDOIMPEGNI, VALIDOACCERTAMENTI, "S", "S", "S");
        }
        assert this.jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("A", ORGANO, ANNO, NUMERO) == true;

        // lo cancello e verifico che non esiste più
        assert this.jEnteHelper.chiamataRichiestaCancellazioneBozzaOAtto("A", ORGANO, ANNO, NUMERO) == true;
        assert this.jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("A", ORGANO, ANNO, NUMERO) == false;
        
    }
    
    @Test
    public void testRichiestaElencoMovimenti() {
        
        List<Movimento> movimenti = this.jEnteHelper.chiamataRichiestaElencoMovimenti("A", "DT", "2009", "1150");
        if( movimenti != null ){
            assert movimenti.size() == 6;
            System.out.println("Movimenti determina 1150-2009");
            for( Movimento movimento: movimenti ){
                String importo = movimento.getMovImpAcce().getImporto();
                String importoImpacc = movimento.getMovImpAcce().getImportoImpacc();
                System.out.println("Importo - importoImpacc: " + importo + " - " + importoImpacc);
            }
        }
        
    }
    
    @Test
    public void testRichiestaInserimentoBozzaOAtto() {

        if( this.jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("A", ORGANO, ANNO, NUMERO) ){
            this.jEnteHelper.chiamataRichiestaCancellazioneBozzaOAtto("A", ORGANO, ANNO, NUMERO);
        }
        assert this.jEnteHelper.chiamataRichiestaInserimentoBozzaOAtto("A", ORGANO, ANNO, NUMERO,
                "Inserimento automatico provvadimento", RESPONSABILE, DATAATTOOBOZZA, VALIDOIMPEGNI, VALIDOACCERTAMENTI, "S", "S", "S") == true;
        assert this.jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("A", ORGANO, ANNO, NUMERO) == true;
        assert this.jEnteHelper.chiamataRichiestaCancellazioneBozzaOAtto("A", ORGANO, ANNO, NUMERO) == true;
        
    }
    
    //@Test
    public void testRichiestaTrasformazioneBozzaInAtto() {
        
        // se esiste l'atto lo cancello; se non esiste la bozza la creo
        if( this.jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("A", ORGANO, ANNO, NUMERO) ){
            assert this.jEnteHelper.chiamataRichiestaCancellazioneBozzaOAtto("A", ORGANO, ANNO, NUMERO) == true;
        }
        
        if( !this.jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("B", ORGANO, ANNO, NUMERO) ){
            assert this.jEnteHelper.chiamataRichiestaInserimentoBozzaOAtto("B", ORGANO, ANNO, NUMERO,
                    "Inserimento automatico provvadimento", RESPONSABILE, DATAATTOOBOZZA, VALIDOIMPEGNI, VALIDOACCERTAMENTI, "S", "S", "S") == true;
        }
        
        assert this.jEnteHelper.chiamataRichiestaTrasformazioneBozzaInAtto("B", ORGANO, ANNO, NUMERO, ORGANO, ANNO, NUMERO, null) == true;
        assert this.jEnteHelper.chiamataRichiestaEsisteBozzaOAtto("A", ORGANO, ANNO, NUMERO) == true;
        
        // ripristino
        this.jEnteHelper.chiamataRichiestaCancellazioneBozzaOAtto("A", ORGANO, ANNO, NUMERO);
        
    }
}