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
public class man {
    protected String training; 
    protected String communication;
    protected String housekeeping;
    protected String individualskill;      

    // Constructors (Initializers)

    public man() {
        training = "We are training hard";
        communication = "Our Communication is Good";
        housekeeping = "Men Can also do Housekeeping";
        individualskill = "JAVA";
    }
   

    // Getter
    public String getTraining() {
        return training;
    }

    public String getCommunication() {
        return communication;
    }

    public String getHousekeeping() {
        return housekeeping;
    }

    public String getIndividualskill() {
        return individualskill;
    }

    // Setter
    public void setTraining(String training) {
        this.training = training;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public void setHousekeeping(String housekeeping) {
        this.housekeeping = housekeeping;
    }

    public void setIndividualskill(String individualskill) {
        this.individualskill = individualskill;
    }
            
}
