/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katabank;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
/**
 *
 * @author exterminator
 */
public class WriteToFile {
    File file;
    PrintWriter printWriter;
    public WriteToFile(){
        this.file = new File("src/test.txt");
        
    }
    public void writeFile(List<String> collection){
        try{
            printWriter = new PrintWriter("src/KataBank/test.txt");
            for(String numberOutput : collection){
                printWriter.write(numberOutput + "\n");
            }
            printWriter.close();
        }catch(Exception d){
                System.out.println(d.getStackTrace());        
        }
    }
}
