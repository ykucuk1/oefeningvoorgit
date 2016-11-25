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
public class Oefening0707 {
    public static void main(String[] args) {
        Adminsitratie administratie = new Adminsitratie();
        //Comment voor in de git
        Student student1 = new Student("Kees Mees", "01-12-1955");
        Student student2 = new Student("Hans Kazan", "05-10-1999");
        Student student3 = new Student("Karel Doorman", "05-11-1889");
        student1.voegResultaat(new Tentamenresultaat("Java", 8.5, "10-02-2005"));
        student1.voegResultaat(new Tentamenresultaat("Database", 4.7, "11-04-2016"));
        student2.voegResultaat(new Tentamenresultaat("Tekenen", 10, "10-10-2016"));
        student3.voegResultaat(new Tentamenresultaat("Rekenen", 4, "10-11-2015"));
        student3.voegResultaat(new Tentamenresultaat("Biologie", 7, "10-11-2015"));
        student3.voegResultaat(new Tentamenresultaat("Verkeer", 9, "12-12-2016"));
        administratie.voegToe(student1);
        administratie.voegToe(student2);
        administratie.voegToe(student3);
        administratie.printOverzicht();
        //weer een andere comment
        
    }
    
}
