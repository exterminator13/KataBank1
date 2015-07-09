package katabank;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author exterminator
 */
public class LinesToNumbers {
    private WriteToFile writer;
    private List toBePrinted;
    private CodeRecognition recognize;
    public LinesToNumbers(){
        this.toBePrinted = new ArrayList<>();
        this.writer = new WriteToFile();
        this.recognize = new CodeRecognition();
    }
    public List convertBegin(String inputNumbers){
        List<String> seperatedInput = this.recognize.numberIsolation(inputNumbers);
        return seperatedInput;
    }
    public String convert(List<String> seperatedInput){
        StringBuilder convertedNumbers = new StringBuilder();
        //a key to run through CodeRecognition so it knows what each letter should look like
        List<String> codeKey = this.recognize.numberIsolation(
                                                   " _     _  _     _  _  _  _  _ \n" 
        +                                          "| |  | _| _||_||_ |_   ||_||_|\n"
                +                                  "|_|  ||_  _|  | _||_|  ||_| _|\n"
                +                                  "                              ");
        
        //goes through each number in the given string
        for(int b = 0; b < seperatedInput.size(); b++){
            for(int i = 0; i < codeKey.size(); i++){           
                if(codeKey.get(i).equals(seperatedInput.get(b))){
                    convertedNumbers.append(i);
                }
            }
            //checks if the number is valid, if not it adds a question mark
            if(!codeKey.contains(seperatedInput.get(b))){
                convertedNumbers.append("?");
            }
        }
        //uses the errorCheckmethod to figure out if it is a valid input or not
        //only on case 3
        
        String finalNumbers = convertedNumbers.toString();
        //puts them in an array to be printed out
        this.toBePrinted.add(finalNumbers);
        return finalNumbers;
    }
 
    public void writeToFile(){
        this.writer.writeFile(this.toBePrinted);
    }
}
