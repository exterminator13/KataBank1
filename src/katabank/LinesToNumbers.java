/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katabank;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author exterminator
 */
public class LinesToNumbers {
    private String number;
    private WriteToFile writer;
    private List toBePrinted;
    private CodeRecognition verify;
    public LinesToNumbers(){
        this.toBePrinted = new ArrayList<>();
        this.writer = new WriteToFile();
        this.verify = new CodeRecognition();
    }
    public List convertBegin(String inputNumbers){
        List<String> seperatedInput = this.verify.numberIsolation(inputNumbers);
        return seperatedInput;
    }
    public String convert(List<String> seperatedInput){
        StringBuilder convertedNumbers = new StringBuilder();
        //a key to run through CodeRecognition so it knows what each letter should look like
        List<String> codeKey = this.verify.numberIsolation(
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
        
//        String finalNumbers = convertedNumbers.toString() + errorCheck(convertedNumbers.toString());
        String finalNumbers = convertedNumbers.toString();
        //puts them in an array to be printed out
        this.toBePrinted.add(finalNumbers);
        return finalNumbers;
    }
    //Only use for case 3
    public String errorCheck(String convertedNumbers){
        if(convertedNumbers.contains("?")){
            return " ILL";
        }
        if(!accountValidation(convertedNumbers.toString())){
                return " ERR";
        }
        return "";
    }
    public boolean accountValidation(String convertedNumbers){
        if(!convertedNumbers.contains("?")){
            int numbers = Integer.parseInt(convertedNumbers);
//            System.out.println(numbers);
            String d = convertedNumbers.charAt(convertedNumbers.length()-1) + "";
            int total = Integer.parseInt(d);
            int count = 2;
        
            for(int i = convertedNumbers.length()-2; i >= 0; i = i - 1){
                String number = convertedNumbers.charAt(i) + "";
                int b = Integer.parseInt(number);
//                System.out.println(b);
                total += (b * count);
//                System.out.println(count);
                count++;
                
            }
                return (total % 11 == 0);
            }else{
                return false;
        }
    }
    public void writeToFile(){
        this.writer.writeFile(this.toBePrinted);
    }
    //use only for case 4
    public String findValidation(String inputNumbers){
        List<String> validNumber = new ArrayList();
        List<String> errCode = verify.numberIsolation(inputNumbers);
        
        if(this.accountValidation(this.convert(errCode))){
            return this.convert(errCode);
        }else{
            String libChanges = "|_ ";
            for(int l = 0; l < libChanges.length(); l++){
            //Replacing each character with an underscore
            for(int b = 0; b < errCode.size(); b++){
    //            String originalNumber = errCode.get(b);
                char[] newNumber = errCode.get(b).toCharArray();
                for(int i = 0; i < newNumber.length; i++){
                    char original = newNumber[i];

                    newNumber[i] = libChanges.charAt(l);
                    String outputNumber = new String(newNumber);

                    errCode.set(b, outputNumber);
    //                System.out.println(outputNumber);
//                    System.out.println(this.convert(errCode));
                    if(this.accountValidation(this.convert(errCode))){
                        validNumber.add("'" + this.convert(errCode) + "'");
                    }
                    newNumber[i] = original;
                        String originalNumber = new String(newNumber);
                        errCode.set(b, originalNumber);
                }
            }
            
            }
            if(validNumber.size() <= 1){
                return validNumber.toString().substring(2,validNumber.toString().length()-2);
            }else{
                Collections.sort(validNumber);
                return this.convert(errCode) + " AMB " + validNumber.toString();
        }
        }
    }
}
