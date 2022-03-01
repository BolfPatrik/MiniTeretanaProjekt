/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import teretana.vjezbanje.Osoba;
import util.EdunovaException;
import util.OibValidation;

/**
 *
 * @author patri
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

   
    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaOib();
        kontrolaEmail();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
       
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
       
    }

    private void kontrolaOib() throws EdunovaException{
        if (!OibValidation.checkOIB(entitet.getOib())) {
            throw new EdunovaException("OIB nije formalno ispravan");
        }
    }

    private void kontrolaEmail() throws EdunovaException{
        
    }
}
    

