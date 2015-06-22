/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        for (int a = 0; a < inputNumbers.length()/12; a++){
            String number = "";
            int i = 0;
            for(int b = 0; b < 3; b++){
                number += inputNumbers.substring(i + (a * 3), i + 3 + (a * 3)) + "\n";
                i = i + (inputNumbers.length()/4) + 1;
            }
            seperatedNumbers.add(number);
            
        }
        return seperatedNumbers;
    }
//        public String getNumber(int number) {
//             
//
//        return seperatedNumbers;
//    }
}
    
