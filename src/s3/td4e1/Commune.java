/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.td4e1;

/**
 *
 * @author USER
 */
public class Commune {
    private int nbHabitants;
    private double superficie;
    
    Commune(int nbh, double s){
        this.nbHabitants = nbh;
        this.superficie = s;
    }
    
    public int getNbH(){
        return this.nbHabitants;
    }
    public double getsuperficie(){
        return this.superficie;
    }
    public double ratio(){
        return this.nbHabitants/this.superficie;
    }
}
