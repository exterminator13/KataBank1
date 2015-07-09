package katabank;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author exterminator
 */
public class CodeRecognition {
    public String enteredNumbers;
    public List numbers;
    public CodeRecognition(){
    }
    public List<String> numberIsolation(String inputNumbers){
        List<String> seperatedNumbers = new ArrayList<>();
        //seperating each line of the string into seperate pieces
        for (int a = 0; a < inputNumbers.length()/12; a++){
            String number = "";
            int i = 0;
            //getting the correct length of each number's part on every divided line and adding them to a string
            for(int b = 0; b < 3; b++){
                number += inputNumbers.substring(i + (a * 3), i + 3 + (a * 3)) + "\n";
                i = i + (inputNumbers.length()/4) + 1;
            }
            seperatedNumbers.add(number);
            
        }
        return seperatedNumbers;
    }
}
    
