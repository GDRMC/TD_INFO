/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.td4poly1;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
abstract class Plante {
    
    protected String nom;
    
    public abstract void afficher();
    
}

class Peuplier extends Plante{
    int taille;
    
    Peuplier(int i, String s){
        this.nom=s;
        this.taille=i;
    }
    
    public void afficher(){
        System.out.println("Bonjour, je suis un peu plié");
    }
}

class Pin extends Plante{
    int age;
    
    Pin(int i,String s){
        this.nom=s;
        this.age=i;
    }
    
    public void afficher(){
        System.out.println("Bonjour, je suis un peu cuit");
    }
}

class Rosier extends Plante{
    
    Rosier(String s){
        this.nom=s;
    }
    
    public void afficher(){
        System.out.println("Bonsoir, je ne suis pas comme les autres D:");
    }
}

class test{
    public static void main(String[]args){
        ArrayList<Plante>a = new ArrayList();
        Plante p1 = new Peuplier(12,"Toto le Peuplier");
        p1.afficher();
        Plante p2 = new Pin(2,"Titi le Pin");
        p2.afficher();
        Plante p3 = new Rosier("Gégé le Rosier (Beau c'est un nom nul)");
        p3.afficher();
    }
}