/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import nl.garvelink.iban.IBAN;
import teretana.vjezbanje.Trener;
import util.EdunovaException;

/**
 *
 * @author patri
 */
public class ObradaTrener extends ObradaOsoba<Trener>{

    @Override
    public List<Trener> read() {
        return session.createQuery("from Trener").list();
    }
    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
        kontrolaIBAN();
    }

    private void kontrolaIBAN() throws EdunovaException {
        if (entitet.getIban() == null) {
            throw new EdunovaException("Obavezno IBAN");
        }
        try {
            IBAN iban = IBAN.valueOf(entitet.getIban());
            if (!iban.isSEPA()) {
                throw new EdunovaException("IBAN nije ispravan");
            }
        } catch (Exception e) {
            throw new EdunovaException("IBAN nije ispravan");
        }

    }
    

    
     

   
    
}
