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
public class measurements {
    protected String sensitivity;
    protected int sampling_rate;
    protected String integration;
    protected String reporting;

    public measurements() {
        sensitivity = "";
        sampling_rate = 9;
        integration = "";
        reporting = "";
    }

    
    
    // Getter Setter
    public String getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }

    public int getSampling_rate() {
        return sampling_rate;
    }

    public void setSampling_rate(int sampling_rate) {
        this.sampling_rate = sampling_rate;
    }

    public String getIntegration() {
        return integration;
    }

    public void setIntegration(String integration) {
        this.integration = integration;
    }

    public String getReporting() {
        return reporting;
    }

    public void setReporting(String reporting) {
        this.reporting = reporting;
    }

}
