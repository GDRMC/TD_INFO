/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.td3e1;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class File {
    
    ArrayList<String>list;
    
    public File(){
        list = new ArrayList<String>();
    }
    
    public void add(String s){
        list.add(s);
    }
    
    public String get(){
        String r = null;
        if(!this.estVide()){
            r = this.list.remove(0);
        }
        return r;
    }
    
    public boolean estVide(){
        return list.isEmpty();
    }
}
