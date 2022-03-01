/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import teretana.vjezbanje.Polaznik;
import util.EdunovaException;

/**
 *
 * @author patri
 */
public class ObradaPolaznik extends ObradaOsoba<Polaznik>{

    @Override
    public List<Polaznik> read() {
        return session.createQuery("from Polaznik").list();
    }
    
     @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate(); 
    }
    
}
