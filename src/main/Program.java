/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.modell.Raktar;

/**
 *
 * @author vizsgaszf
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Raktar raktar= new Raktar();
        
        
        try {
             ObjectOutputStream objMent=new ObjectOutputStream(new FileOutputStream("raktar.bin"));
             objMent.writeObject(raktar);
             objMent.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        raktar=null;
        
        try {
            ObjectInputStream objOlvas= new ObjectInputStream(new FileInputStream("raktar.bin"));
            raktar= (Raktar)objOlvas.readObject();
            objOlvas.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
