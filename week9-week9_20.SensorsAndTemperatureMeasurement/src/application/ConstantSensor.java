/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Hugh
 */
public class ConstantSensor implements Sensor {
    
    private int params;
    
    public ConstantSensor(int params){
        this.params = params;
    }
    
    
    @Override
    public int measure(){
        return this.params;
    }

    @Override
    public boolean isOn() {
       return true;
    }

    @Override
    public void on() {
        
    }

    @Override
    public void off() {
       
    }
}
