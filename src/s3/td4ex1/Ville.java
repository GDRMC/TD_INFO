/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.td4ex1;

/**
 *
 * @author USER
 */
public class Ville extends Commune {
    
    private String monument;
    
    Ville(int nbh, double s, String n){
        super(nbh,s);
        this.monument = n;
    }
    
    public double ratio(){
        return super.ratio();
    }
}
