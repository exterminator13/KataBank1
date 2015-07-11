package katabank;
import katabank.CodeRecognition;
/**
 *
 * @author exterminator
 */
//link to kata guidelines: http://codingdojo.org/cgi-bin/index.pl?KataBankOCR
public class KataBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CodeVerify b = new CodeVerify();
        System.out.println(b.findValidation("    _  _     _  _  _  _  _ \n" +
"  | _| _||_| _ |_   ||_||_|\n" +
"  ||_  _|  | _||_|  ||_| _ \n" +
"                           "));
        LinesToNumbers d = new LinesToNumbers();
        System.out.println(b.findValidation("    _  _  _  _  _  _     _ \n" +
"|_||_|| || ||_   |  |  | _ \n" +
"  | _||_||_||_|  |  |  | _|\n" +
"                           "));
        System.out.println(b.findValidation(" _  _  _  _  _  _  _  _  _ \n" +
"|_||_||_||_||_||_||_||_||_|\n" +
" _| _| _| _| _| _| _| _| _|\n" +
"                           "));
        System.out.println(b.findValidation(" _  _  _  _  _  _  _  _  _ \n" +
"|_ |_ |_ |_ |_ |_ |_ |_ |_ \n" +
" _| _| _| _| _| _| _| _| _|\n" +
"                           "));
        System.out.println(b.findValidation("    _  _     _  _  _  _  _ \n" +
" _| _| _||_||_ |_   ||_||_|\n" +
"  ||_  _|  | _||_|  ||_| _|\n" +
"                           "));

            System.out.println(d.convertBegin(" _  _  _  _  _  _  _  _  _ \n" +
"| || || || || || || || || |\n" +
"|_||_||_||_||_||_||_||_||_|\n" +
"                           "));
        CodeRecognition a = new CodeRecognition();
        a.numberIsolation("    _  _  _  _  _  _     _ \n" +
"|_||_|| || ||_   |  |  ||_ \n" +
"  | _||_||_||_|  |  |  | _|\n" +
"                           ");
    }
    
}
