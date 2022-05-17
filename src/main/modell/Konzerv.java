/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modell;

import java.io.File;
import java.time.LocalDate;

/**
 *
 * @author vizsgaszf
 */
public class Konzerv extends Elelmiszer{
    private File recept;
    private String leiras;


    public Konzerv(String leiras, String nev, String gyarto) throws HibasDatumException {
        super(nev, gyarto);
        this.leiras = leiras;
    }

    public Konzerv(String leiras, String nev, String gyarto, LocalDate lejaratiDatum) {
        super(nev, gyarto, lejaratiDatum);
        this.leiras = leiras;
    }
    
    public void receptMutat(){
        if (recept.exists()) {
            
        }
    }
    


    
    
    
}
