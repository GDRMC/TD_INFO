/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.td4e2;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ArrayListEtud extends ArrayList{
    
    ArrayListEtud(){
        super();
    }
    
    public void add(int i,Object e){
        super.add(i, e);
    }   
    
    public boolean add(Object e){
        super.add(0, e);
        return super.contains(e);
    }
    
}
