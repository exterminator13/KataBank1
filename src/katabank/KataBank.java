/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katabank;
import katabank.CodeRecognition;
import java.io.File;
/**
 *
 * @author exterminator
 */
public class KataBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinesToNumbers b = new LinesToNumbers();
        b.convert("    _  _     _  _  _  _  _ \n" +
"  | _| _||_| _ |_   ||_||_|\n" +
"  ||_  _|  | _||_|  ||_| _ \n" +
"                           ");
        LinesToNumbers d = new LinesToNumbers();
        b.convert("    _  _  _  _  _  _     _ \n" +
"|_||_|| || ||_   |  |  | _ \n" +
"  | _||_||_||_|  |  |  | _|\n" +
"                           ");
        b.writeToFile();
        
//        WriteToFile a = new WriteToFile();
//        a.writeNewLine("hi");
        
//        System.out.println(d.convert(" _  _  _  _  _  _  _  _  _ \n" +
//"| || || || || || || || || |\n" +
//"|_||_||_||_||_||_||_||_||_|\n" +
//"                           "));
//        CodeRecognition a = new CodeRecognition();
//        a.numberIsolation("    _  _  _  _  _  _     _ \n" +
//"|_||_|| || ||_   |  |  ||_ \n" +
//"  | _||_||_||_|  |  |  | _|\n" +
//"                           ");
    }
    
}
