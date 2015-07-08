/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        if(!convertedNumbers.contains("?")){
            String d = convertedNumbers.charAt(convertedNumbers.length()-1) + "";
            int total = Integer.parseInt(d);
            int count = 2;
        
            for(int i = convertedNumbers.length()-2; i >= 0; i = i - 1){
                String number = convertedNumbers.charAt(i) + "";
                int b = Integer.parseInt(number);
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
        List<String> errCode = this.recognize.numberIsolation(inputNumbers);
        String converted = this.linesToNumbers.convert(errCode);
        if(accountValidation(converted)){
            return converted;
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
                    if(this.accountValidation(this.linesToNumbers.convert(errCode))){
                        validNumber.add("'" + this.linesToNumbers.convert(errCode) + "'");
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
                return linesToNumbers.convert(errCode) + " AMB " + validNumber.toString();
        }
        }
    }
}
