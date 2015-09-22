/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.td3e2;

/**
 *
 * @author USER
 */
public class Personne {
    
    String nom;
    int prio;
    
    Personne(String n,int p){
        nom = n;
        prio = p;
        
    }
    
    public int getPrio(){
        return this.prio;
    }
    
    public void setPrio(int i){
        this.prio = i;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String n){
        this.nom = n;
    }
    
}
