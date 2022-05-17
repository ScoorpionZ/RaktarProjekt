/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vizsgaszf
 */
public class Raktar implements Iterable<Elelmiszer>, Serializable{
    
     private ArrayList<Elelmiszer> elelmiszerek;
     
     public Raktar(){
         elelmiszerek=new ArrayList<>();
         try {
             Konzerv k1 =new Konzerv("Leves...", "Bab leves", "Knor");
         } catch (HibasDatumException ex) {
             Logger.getLogger(Raktar.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }

    @Override
    public Iterator<Elelmiszer> iterator() {
        return Collections.unmodifiableList(elelmiszerek).iterator();
    }
    
    public List<Elelmiszer> rendezNevSzerint(){
        Collections.sort(elelmiszerek,Elelmiszer.nevRendezo());
        return Collections.unmodifiableList(elelmiszerek);
    }
    
    public List<Elelmiszer> rendezGyartoSzerint(){
        Collections.sort(elelmiszerek,Elelmiszer.gyartoRendezo());
        return Collections.unmodifiableList(elelmiszerek);
    }
    
}
