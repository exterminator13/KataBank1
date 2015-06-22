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
public class OutputTest {
    
    public OutputTest() {
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
    LinesToNumbers test = new LinesToNumbers();
     @Test
     public void variousOutputs() {
        assertEquals(test.convert(" _  _  _  _  _  _  _  _  _ \n" +
                     "| || || || || || || || || |\n" +
                     "|_||_||_||_||_||_||_||_||_|\n" +
"                           "), "000000000");
        assertEquals(test.convert("                           \n" +
"  |  |  |  |  |  |  |  |  |\n" +
"  |  |  |  |  |  |  |  |  |\n" +
"                           "), "111111111");
        assertEquals(test.convert(" _  _  _  _  _  _  _  _  _ \n" +
" _| _| _| _| _| _| _| _| _|\n" +
"|_ |_ |_ |_ |_ |_ |_ |_ |_ \n" +
"                           "), "222222222");
        assertEquals(test.convert(" _  _  _  _  _  _  _  _  _ \n" +
" _| _| _| _| _| _| _| _| _|\n" +
" _| _| _| _| _| _| _| _| _|\n" +
"                           "), "333333333");
        assertEquals(test.convert("                           \n" +
"|_||_||_||_||_||_||_||_||_|\n" +
"  |  |  |  |  |  |  |  |  |\n" +
"                           "),"444444444");
        assertEquals(test.convert(" _  _  _  _  _  _  _  _  _ \n" +
"|_ |_ |_ |_ |_ |_ |_ |_ |_ \n" +
" _| _| _| _| _| _| _| _| _|\n" +
"                           "), "555555555");
        assertEquals(test.convert(" _  _  _  _  _  _  _  _  _ \n" +
"|_ |_ |_ |_ |_ |_ |_ |_ |_ \n" +
"|_||_||_||_||_||_||_||_||_|\n" +
"                           "), "666666666");
        assertEquals(test.convert(" _  _  _  _  _  _  _  _  _ \n" +
"  |  |  |  |  |  |  |  |  |\n" +
"  |  |  |  |  |  |  |  |  |\n" +
"                           "), "777777777");
        assertEquals(test.convert(" _  _  _  _  _  _  _  _  _ \n" +
"|_||_||_||_||_||_||_||_||_|\n" +
"|_||_||_||_||_||_||_||_||_|\n" +
"                           "),"888888888");
        assertEquals(test.convert(" _  _  _  _  _  _  _  _  _ \n" +
"|_||_||_||_||_||_||_||_||_|\n" +
" _| _| _| _| _| _| _| _| _|\n" +
"                           "),"999999999");
     }
     
        
}
