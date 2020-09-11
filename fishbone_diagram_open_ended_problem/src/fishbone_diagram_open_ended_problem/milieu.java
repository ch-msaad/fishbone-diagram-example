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
public class milieu {
    protected String contamination;
    protected int temperature;
    protected String humidity;
    protected String light;

    public milieu() {
        contamination = "";
        temperature = 38;
        humidity = "";
        light = "";
    }

    
    // Getter Setter
    public String getContamination() {
        return contamination;
    }

    public void setContamination(String contamination) {
        this.contamination = contamination;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    
}
