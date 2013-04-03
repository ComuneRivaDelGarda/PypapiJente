/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.axiastudio.pypapi.plugins.jente.JEnteHelper;
import it.arezzo.infor.jente.jfinanziaria.services.Movimento;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AXIA Studio (http://www.axiastudio.com)
 */
public class MoriReadOnlyJUnitTest {
    
    private JEnteHelper jEnteHelper;
    
    public MoriReadOnlyJUnitTest() {
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
            }
        }
        
    }
}