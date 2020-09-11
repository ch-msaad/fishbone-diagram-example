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
public class machines {
    protected String Detector;
    protected String auto_sampler;
    protected String injector;
    protected String oven;
    protected String column;

    public machines() {
        Detector = "";
        auto_sampler = "";
        injector = "";
        oven = "";
        column = "";
    }

    
    // Getter Setter
    public String getDetector() {
        return Detector;
    }

    public void setDetector(String Detector) {
        this.Detector = Detector;
    }

    public String getAuto_sampler() {
        return auto_sampler;
    }

    public void setAuto_sampler(String auto_sampler) {
        this.auto_sampler = auto_sampler;
    }

    public String getInjector() {
        return injector;
    }

    public void setInjector(String injector) {
        this.injector = injector;
    }

    public String getOven() {
        return oven;
    }

    public void setOven(String oven) {
        this.oven = oven;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    
}
    