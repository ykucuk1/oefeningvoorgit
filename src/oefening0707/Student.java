package oefening0707;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author ykucuk1
 */
public class Student {
    private String naam;
    private String geboortedatum;
    private ArrayList<Tentamenresultaat> resultaten;
    
    public Student(String naam, String geboortedatum){
        this.resultaten = new ArrayList<>();
        this.naam = naam;
        this.geboortedatum = geboortedatum;
    }
    
    public void printOverzicht(){
        System.out.println("Overzicht van cijfers");
        for(Tentamenresultaat tentR: resultaten){
            System.out.println(tentR);
        }
    }
    public void voegResultaat(Tentamenresultaat resulaat){
        resultaten.add(resulaat);
    }
    
    public String toString(){
        return String.format("%-15s geboortedatum %10s", naam, geboortedatum);
    }
}
