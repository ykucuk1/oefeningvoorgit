package oefening0707;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ykucuk1
 */
public class Tentamenresultaat {
    private String vak;
    private double cijfer;
    private String datum;
    
    public Tentamenresultaat(String vak, double cijfer, String datum){
        this.vak = vak;
        this.cijfer = cijfer;
        this.datum = datum;
    }
    public double getCijfer(){
        return cijfer;
    }
    public String toString(){
        return String.format("%-20s cijfer %4.1f gemaakt op %10s ", vak, getCijfer(), datum);
    }
}
