/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modell;

import java.io.Serializable;
import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;
import javafx.print.Collation;

class nevComparator implements Comparator<Elelmiszer>{

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator rend= Collator.getInstance();
        return rend.compare(o1.getNev(), o2.getNev());
    }
}

class gyartoComparator implements Comparator<Elelmiszer>{

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator rend= Collator.getInstance();
        return rend.compare(o1.getGyarto(), o2.getGyarto());
    }
}

/**
 *
 * @author vizsgaszf
 */
public class Elelmiszer implements Serializable{
    private String nev, gyarto;
    private LocalDate lejaratiDatum;

    public Elelmiszer(String nev, String gyarto) throws HibasDatumException {
        this.nev = nev;
        this.gyarto = gyarto;
        if(lejaratiDatum.isBefore(LocalDate.now()) && lejaratiDatum==LocalDate.now()){
            throw new HibasDatumException("Lejárt élelmiszer");
        }
        else{
            
        }
    }

    public Elelmiszer(String nev, String gyarto, LocalDate lejaratiDatum) {
        this.nev = nev;
        this.gyarto = gyarto;
        this.lejaratiDatum = lejaratiDatum;
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }
    
    public static nevComparator nevRendezo(){
        return new nevComparator();
    }
    
    public static gyartoComparator gyartoRendezo(){
        return new gyartoComparator();
    }
    
    
}
