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
public class materials {
    protected int purity;
    protected int grade;
    protected int sampling;
    protected int storage;

     // Constructors (Initializers)
    public materials() {
        purity = 5;
        grade = 10;
        sampling = 0;
        storage = 10;
    }
    
    public int getPurity() {
        return purity;
    }

    public int getGrade() {
        return grade;
    }

    public int getSampling() {
        return sampling;
    }

    public int getStorage() {
        return storage;
    }

    public void setPurity(int purity) {
        this.purity = purity;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSampling(int sampling) {
        this.sampling = sampling;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
    
}
