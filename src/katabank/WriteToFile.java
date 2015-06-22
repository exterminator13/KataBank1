/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katabank;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author exterminator
 */
public class WriteToFile {
    File file;
    FileWriter fileWriter;
    public WriteToFile(){
        this.file = new File("test.txt");
        try{
        this.fileWriter = new FileWriter("test.txt");
        }catch(Exception d){
                System.out.println(d);        
        }
    }
    public void writeNewLine(String newLine){
        try{
            this.fileWriter.write(newLine + "\n");
        }catch(Exception d){
            System.out.println(d);
        }
    }
}
