package Compras;

import Data.CarrosDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class Venda_CarrosIT {
 
private CarrosDAO consultar;

    public Venda_CarrosIT() {
    }
   
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       consultar = new CarrosDAO();
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void testarpesquisarCarro() {
    ResultSet();
    }

    private void ResultSet() {
    System.err.println("Jeep Renegade Sport 1.8 4x2 Flex 16v Aut");
    System.err.println("Chevrolet Onix Hatch Joy 1.0 8v Flex 5p Mec");
    System.err.println("Chevrolet Prisma Sed. Lt 1.4 8v Flexpower 4p");
    System.err.println("Chevrolet Spin Activ7 1.8 8v Econo.flex 5p Aut");
        System.err.println("Volvo S90");
    System.err.println("Porsche 911 GT3 RS 992");
    System.err.println("Chevrolet Camaro 6.2 SS");
    System.err.println("Fiat Strada 1.4 Cd Hard Working");
        System.err.println("Volkswagen Santana 1.8 Mi");
    System.err.println("Fiat Siena 1.0/ex 1.0 Mpi Fire/fire Flex 8v");
    System.err.println("Volkswagen Fusca Null");
    System.err.println("Toyota Hilux Cd Srx 4x4 2.8 Tdi 16v Diesel Aut");
        System.err.println("Ford F-1000 Ss");
    System.err.println("Citroën Aircross Live 1.5 Flex 8v 5p Mec.");
    System.err.println("Kia Sportage 4x2 Mt Lx 2.0 4p");
    }
}