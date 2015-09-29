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
public class TestClass {
    
    public void main(String[]args){
        Commune c = new Commune(1000,2000);
        System.out.println("ratio "+c.ratio());
        
        Ville lr = new Ville(80000,500000,"Les Tours");
        System.out.println("nbH "+lr.getNbH());
    }
    
    
}
