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
public class Adminsitratie {

    private ArrayList<Student> studentenlijst;
    public Adminsitratie(){
        studentenlijst = new ArrayList<>();
    }
    
    public void printOverzicht(){
        System.out.println("Lijst van Studenten");
        for(Student st: studentenlijst){
            System.out.println(st);
            st.printOverzicht();
         }
            
    }
    
    public void voegToe(Student student) {
        studentenlijst.add(student);
    }
}
