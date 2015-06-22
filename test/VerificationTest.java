/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import katabank.LinesToNumbers;
/**
 *
 * @author exterminator
 */
public class VerificationTest {
    
    public VerificationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    LinesToNumbers test = new LinesToNumbers();
    @Test
    public void testVerificatoin(){
        assertEquals(test.convert("    _  _  _  _  _  _     _ \n" +
"|_||_|| || ||_   |  |  | _ \n" +
"  | _||_||_||_|  |  |  | _|\n" +
"                           "),"49006771? ILL");
        assertEquals(test.convert(" _  _  _  _  _  _  _  _    \n" +
"| || || || || || || ||_   |\n" +
"|_||_||_||_||_||_||_| _|  |\n" +
"                           "),"000000051");
        
    }
}
