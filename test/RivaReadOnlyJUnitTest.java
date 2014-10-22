import com.axiastudio.pypapi.plugins.jente.JEnteHelper;
import com.axiastudio.pypapi.plugins.jente.webservices.Movimento;
import org.junit.*;

import java.util.List;

/**
 * User: tiziano
 * Date: 22/10/14
 * Time: 14:25
 */
public class RivaReadOnlyJUnitTest {

    private JEnteHelper jEnteHelper;

    public RivaReadOnlyJUnitTest() {
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
    public void testRichiestaElencoMovimenti() {

        List<Movimento> movimenti = this.jEnteHelper.chiamataRichiestaElencoMovimenti("A", "DT", "2013", "27");
        if( movimenti != null ){
            for( Movimento movimento: movimenti ){
                String importo = movimento.getMovImpAcce().getImporto();
                System.out.println("Importo: " + importo);
                System.out.println(movimento.getMovImpAcce().getAttributi().getAttributo01().getDescrizione());
            }
        }

    }

}
