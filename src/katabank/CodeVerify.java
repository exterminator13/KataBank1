package katabank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author exterminator
 */
public class CodeVerify {
    LinesToNumbers linesToNumbers;
    CodeRecognition recognize;
    public CodeVerify(){
        this.linesToNumbers = new LinesToNumbers();
        this.recognize = new CodeRecognition();
    }
    //Only use for case 3
    public String errorCheck(String convertedNumbers){
        if(convertedNumbers.contains("?")){
            return " ILL";
        }
        if(!accountValidation(convertedNumbers)){
                return " ERR";
        }
        return "";
    }
    public boolean accountValidation(String convertedNumbers){
        //checksum calculation: (d1+2*d2+3*d3 +..+9*d9) mod 11 = 0
        if(!convertedNumbers.contains("?")){
            int total = Character.getNumericValue(convertedNumbers.charAt(convertedNumbers.length()-1));
            int count = 2;       
            for(int i = convertedNumbers.length()-2; i >= 0; i = i - 1){
                int b = Character.getNumericValue(convertedNumbers.charAt(i));
                total += (b * count);
                count++;
            }
                return (total % 11 == 0);
            }else{
                return false;
        }
    }
        //use only for case 4
    public String findValidation(String inputNumbers){
        List<String> validNumber = new ArrayList();
        List<String> inputCode = this.recognize.numberIsolation(inputNumbers);
        String converted = this.linesToNumbers.convert(inputCode);
        if(accountValidation(converted)){
            return converted;
        }else{
            String libChanges = "|_ ";
            for(int l = 0; l < libChanges.length(); l++){
            //Replacing each character with a new character in libChanges
                for(int b = 0; b < inputCode.size(); b++){
                    char[] newNumber = inputCode.get(b).toCharArray();
                    for(int i = 0; i < newNumber.length; i++){
                        char original = newNumber[i];
                        newNumber[i] = libChanges.charAt(l);
                        String outputNumber = new String(newNumber);
                        inputCode.set(b, outputNumber);
                        if(this.accountValidation(this.linesToNumbers.convert(inputCode))){
                            validNumber.add("'" + this.linesToNumbers.convert(inputCode) + "'");
                        }
                        newNumber[i] = original;
                            String originalNumber = new String(newNumber);
                            inputCode.set(b, originalNumber);
                    }
                }           
            }
            if(validNumber.size() <= 1){
                return validNumber.toString().substring(2,validNumber.toString().length()-2);
            }else{
                Collections.sort(validNumber);
                return linesToNumbers.convert(inputCode) + " AMB " + validNumber.toString();
            }
        }
    }
}
