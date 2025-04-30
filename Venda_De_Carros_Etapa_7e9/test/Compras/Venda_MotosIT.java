package Compras;

import Data.Moto;
import Data.MotoDAO;
import com.mysql.cj.jdbc.result.ResultSetInternalMethods;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Venda_MotosIT {
 
private MotoDAO consultar;

    public Venda_MotosIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       consultar = new MotoDAO();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testarbtnpesquisarMoto() {
    consultar.getMotoNome("harley-davidson cvo");
    }
}
