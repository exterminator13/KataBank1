/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katabank;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author exterminator
 */
public class LinesToNumbers {
    private String number;
    private WriteToFile writer;
    private List toBePrinted;
    public LinesToNumbers(){
        this.toBePrinted = new ArrayList<>();
        this.writer = new WriteToFile();
    }
    public String convert(String inputNumbers){
        StringBuilder convertedNumbers = new StringBuilder();
        CodeRecognition key = new CodeRecognition();
        //a key to run through CodeRecognition so it knows what each letter should look like
        List<String> codeKey = key.numberIsolation(
                                                   " _     _  _     _  _  _  _  _ \n" 
        +                                          "| |  | _| _||_||_ |_   ||_||_|\n"
                +                                  "|_|  ||_  _|  | _||_|  ||_| _|\n"
                +                                  "                              ");
        List<String> seperatedInput = key.numberIsolation(inputNumbers);
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
        String finalNumbers = convertedNumbers.toString() + errorCheck(convertedNumbers.toString());
        //puts them in an array to be printed out
        this.toBePrinted.add(finalNumbers);
        return finalNumbers;
    }
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
        int total = 0;
        int count = 2;
        for(int i = convertedNumbers.length(); i < 0; i++){
            total += convertedNumbers.charAt(i) + count;
            count++;
        }
        double added = Math.pow(total, 9);
        return added % 11 == 0;
    }
    public void writeToFile(){
        this.writer.writeFile(this.toBePrinted);
    }
}
