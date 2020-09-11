/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishbone_diagram_open_ended_problem;

/**
 *
 * @author Dell pc
 */
public class methods {
    protected int mobile_phase;
    protected int injection_volume;
    protected int buffer_strength;
    protected int temperature;
    protected int flow_rate;
    protected int PH;

    public methods() {
        mobile_phase = 2;
        injection_volume = 10;
        buffer_strength = 20;
        temperature = 37;
        flow_rate = 100;
        PH = 7;
    }

    
    
    
    // Getter() Setter()
    public int getMobile_phase() {
        return mobile_phase;
    }

    public void setMobile_phase(int mobile_phase) {
        this.mobile_phase = mobile_phase;
    }

    public int getInjection_volume() {
        return injection_volume;
    }

    public void setInjection_volume(int injection_volume) {
        this.injection_volume = injection_volume;
    }

    public int getBuffer_strength() {
        return buffer_strength;
    }

    public void setBuffer_strength(int buffer_strength) {
        this.buffer_strength = buffer_strength;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getFlow_rate() {
        return flow_rate;
    }

    public void setFlow_rate(int flow_rate) {
        this.flow_rate = flow_rate;
    }

    public int getPH() {
        return PH;
    }

    public void setPH(int PH) {
        this.PH = PH;
    }
    
}
