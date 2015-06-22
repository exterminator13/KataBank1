/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katabank;
import java.util.List;
/**
 *
 * @author exterminator
 */
public class LinesToNumbers {
    private String number;
    public LinesToNumbers(){
    }
    public String convert(String inputNumbers){
        String convertedNumbers = "";
        CodeRecognition key = new CodeRecognition();
        List<String> codeKey = key.numberIsolation(
                                                   " _     _  _     _  _  _  _  _ \n" 
        +                                          "| |  | _| _||_||_ |_   ||_||_|\n"
                +                                  "|_|  ||_  _|  | _||_|  ||_| _|\n"
                +                                  "                              ");
        List<String> seperatedInput = key.numberIsolation(inputNumbers);
        for(int b = 0; b < seperatedInput.size(); b++){
            boolean notNumber = true;
            int checkedNumbers = 0;
            for(int i = 0; i < codeKey.size(); i++){
                if(codeKey.get(i).equals(seperatedInput.get(b))){
                    convertedNumbers += i;
                }else{
                    checkedNumbers++;
                }
            }
            if (checkedNumbers == 10){
                    convertedNumbers += "?";
            }  
            
        }
        if(convertedNumbers.contains("?")){
            convertedNumbers += " ILL";
        }else{
            if(!accountValidation(convertedNumbers)){
                convertedNumbers += " ERR";
            }
        }
        return convertedNumbers;
    }
    public boolean accountValidation(String convertedNumbers){
//        int lastNumber = convertedNumbers.indexOf(convertedNumbers.length());
//        int added = lastNumber;
//        int firstNumber = 2;
//        for(int i = lastNumber; i > 0; i--){
//            added += convertedNumbers.charAt(i) * firstNumber;
//            firstNumber++;
//        }
        int total = 0;
        int count = 2;
        for(int i = convertedNumbers.length(); i < 0; i++){
            total += convertedNumbers.charAt(i) + count;
            count++;
        }
        double added = Math.pow(total, 9);
        if(added % 11 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
