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

public class Case4Test {
    
    public Case4Test() {
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
    public void tests(){
        assertEquals(test.findValidation("                           \n" +
"  |  |  |  |  |  |  |  |  |\n" +
"  |  |  |  |  |  |  |  |  |\n" +
"                           "), "711111111");
        assertEquals(test.findValidation(" _  _  _  _  _  _  _  _  _ \n" +
"  |  |  |  |  |  |  |  |  |\n" +
"  |  |  |  |  |  |  |  |  |\n" +
"                           "), "777777177");
        assertEquals(test.findValidation(" _  _  _  _  _  _  _  _  _ \n" +
" _|| || || || || || || || |\n" +
"|_ |_||_||_||_||_||_||_||_|\n" +
"                           "), "200800000");
        assertEquals(test.findValidation(" _  _  _  _  _  _  _  _  _ \n" +
" _| _| _| _| _| _| _| _| _|\n" +
" _| _| _| _| _| _| _| _| _|\n" +
"                           "), "333393333");
        assertEquals(test.findValidation(" _  _  _  _  _  _  _  _  _ \n" +
"|_||_||_||_||_||_||_||_||_|\n" +
"|_||_||_||_||_||_||_||_||_|\n" +
"                           "), "888888888 AMB ['888886888', '888888880', '888888988']");
        assertEquals(test.findValidation(" _  _  _  _  _  _  _  _  _ \n" +
"|_ |_ |_ |_ |_ |_ |_ |_ |_ \n" +
" _| _| _| _| _| _| _| _| _|\n" +
"                           "), "555555555 AMB ['555655555', '559555555']");
        assertEquals(test.findValidation(" _  _  _  _  _  _  _  _  _ \n" +
"|_ |_ |_ |_ |_ |_ |_ |_ |_ \n" +
"|_||_||_||_||_||_||_||_||_|\n" +
"                           "),"666666666 AMB ['666566666', '686666666']");
        assertEquals(test.findValidation(" _  _  _  _  _  _  _  _  _ \n" +
"|_||_||_||_||_||_||_||_||_|\n" +
" _| _| _| _| _| _| _| _| _|\n" +
"                           "), "999999999 AMB ['899999999', '993999999', '999959999']");
        assertEquals(test.findValidation("    _  _  _  _  _  _     _ \n" +
"|_||_|| || ||_   |  |  ||_ \n" +
"  | _||_||_||_|  |  |  | _|\n" +
"                           "), "490067715 AMB ['490067115', '490067719', '490867715']");
        assertEquals(test.findValidation("    _  _     _  _  _  _  _ \n" +
" _| _| _||_||_ |_   ||_||_|\n" +
"  ||_  _|  | _||_|  ||_| _|\n" +
"                           "), "123456789");
        assertEquals(test.findValidation(" _     _  _  _  _  _  _    \n" +
"| || || || || || || ||_   |\n" +
"|_||_||_||_||_||_||_| _|  |\n" +
"                           "), "000000051");
        assertEquals(test.findValidation("    _  _  _  _  _  _     _ \n" +
"|_||_|| ||_||_   |  |  | _ \n" +
"  | _||_||_||_|  |  |  | _|\n" +
"                           "), "490867715");
    }
    
}
