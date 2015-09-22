/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.td3e2;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class FilePrio {
    
    ArrayList<Personne>list;
    
    FilePrio(){
        list = new ArrayList<Personne>();
    }
    
    public void add(Personne p){
        if(list.size()==0){
            this.list.add(p);
        }else{
            int bufferPrio = p.getPrio();
            for(int i=0;i<list.size()&&bufferPrio<=list.get(i).getPrio();i++){
                if(bufferPrio>=list.get(i).getPrio()){
                    this.list.add(i,p);
                }
            }
        }
    }
    
    public Personne get(){
        return this.list.get(0);
    }
    
    public boolean estVide(){
        if(!this.list.isEmpty()){
            return false;
        } else {
            return true;
        }
    }
    
    public int getPrioTete(){
        if(!estVide()){
            return this.list.get(0).getPrio();
        }
        return -1;
    }
    
    
}
