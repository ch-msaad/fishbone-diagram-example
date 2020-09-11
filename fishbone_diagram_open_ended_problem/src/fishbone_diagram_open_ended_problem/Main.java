/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishbone_diagram_open_ended_problem;

import java.io.FileWriter; 
import java.io.IOException; 
import java.lang.*;
import java.util.Scanner;
import java.io.FileNotFoundException; 
import java.io.FileReader;
/**
 *
 * @author Dell pc
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
  
    
     man manobj = new man();
     materials matobj = new materials();
     methods method_obj = new methods();
     measurements measure_obj = new measurements();
     milieu milieu_obj = new milieu();
     machines machine_obj = new machines();
     
     
        // Scanner 
        Scanner scan = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Enter Training Status:");
        String training = scan.nextLine();
        manobj.setTraining(training);
        //System.out.println(manobj.getTraining());
        
        System.out.println("Enter Communication Status:");
        String communication = scan.nextLine();
        manobj.setCommunication(communication);
        //System.out.println(manobj.getCommunication());
        
        System.out.println("Enter Housekeeping Status:");
        String housekeeping = scan.nextLine();
        manobj.setHousekeeping(housekeeping);
       // System.out.println(manobj.getHousekeeping());
        
        System.out.println("Enter Individual Skill:");
        String individualskill = scan.nextLine();
        manobj.setIndividualskill(individualskill);
        //System.out.println(manobj.getIndividualskill());
        
        
        
        System.out.println("Enter Purity level:");
        int purity = scan.nextInt();
        matobj.setPurity(purity);
        //System.out.println(matobj.getPurity());
        
         System.out.println("Enter Grade:");
        int grade = scan.nextInt();
        matobj.setGrade(grade);
        //System.out.println(matobj.getGrade());
        
         System.out.println("Enter Sampling:");
        int sample = scan.nextInt();
        matobj.setSampling(sample);
        //System.out.println(matobj.getSampling());
        
         System.out.println("Enter Storage Capacity:");
        int storage = scan.nextInt();
        matobj.setStorage(storage);
        //System.out.println(matobj.getStorage());
        
        
        
        
        System.out.println("Enter Mobile Phase:");
        int mobile = scan.nextInt();
        method_obj.setMobile_phase(mobile);
        //System.out.println(method_obj.getMobile_phase());
        
        System.out.println("Enter Injection Volume:");
        int volume = scan.nextInt();
        method_obj.setInjection_volume(volume);
        //System.out.println(method_obj.getInjection_volume());
        
        System.out.println("Enter Buffer Stength:");
        int buffer = scan.nextInt();
        method_obj.setBuffer_strength(buffer);
      //  System.out.println(method_obj.getBuffer_strength());
        
        System.out.println("Enter Temperature:");
        int temp = scan.nextInt();
        method_obj.setTemperature(temp);
       // System.out.println(method_obj.getTemperature());
        
        System.out.println("Enter Flow Rate:");
        int flow_rate = scan.nextInt();
        method_obj.setFlow_rate(flow_rate);
      //  System.out.println(method_obj.getFlow_rate());
        
        System.out.println("Enter PH:");
        int PH = scan.nextInt();
        method_obj.setPH(PH);
       // System.out.println(method_obj.getPH());
        
        
        System.out.println("Enter Sensitivity:");
        String sensitivity = scann.nextLine();
        measure_obj.setSensitivity(sensitivity);
       // System.out.println(measure_obj.getSensitivity());
        
        System.out.println("Enter Sampling Rate:");
        int sampling = scan.nextInt();
        measure_obj.setSampling_rate(sampling);
       // System.out.println(measure_obj.getSampling_rate());
        
         System.out.println("Enter Integration:");
        String integration = scann.nextLine();
        measure_obj.setIntegration(integration);
       // System.out.println(measure_obj.getIntegration());
        
         System.out.println("Enter Reporting:");
        String report = scann.nextLine();
        measure_obj.setReporting(report);
       // System.out.println(measure_obj.getReporting());
        
        
        
        
        
        System.out.println("Enter Contamination:");
        String cont = scann.nextLine();
        milieu_obj.setContamination(cont);
      //  System.out.println(milieu_obj.getContamination());
        
         System.out.println("Enter Temperature:");
        int tempe = scan.nextInt();
        milieu_obj.setTemperature(tempe);
      //  System.out.println(milieu_obj.getTemperature());
        
         System.out.println("Enter Humidity:");
        String humidity = scann.nextLine();
        milieu_obj.setHumidity(humidity);
     //   System.out.println(milieu_obj.getHumidity());
        
         System.out.println("Enter Light:");
        String light = scann.nextLine();
        milieu_obj.setLight(light);
      //  System.out.println(milieu_obj.getLight());
        
        
        
        
        
        System.out.println("Enter Detector:");
        String detector = scann.nextLine();
        machine_obj.setDetector(detector);
      //  System.out.println(machine_obj.getDetector());
        
          System.out.println("Enter Auto Sampler:");
        String auto = scann.nextLine();
        machine_obj.setAuto_sampler(auto);
      //  System.out.println(machine_obj.getAuto_sampler());
        
         System.out.println("Enter Injector:");
        String injector = scann.nextLine();
        machine_obj.setInjector(injector);
     //   System.out.println(machine_obj.getInjector());
        
         System.out.println("Enter Oven:");
        String oven = scann.nextLine();
        machine_obj.setOven(oven);
     //   System.out.println(machine_obj.getOven());
        
         System.out.println("Enter Column:");
        String column = scann.nextLine();
        machine_obj.setColumn(column);
      //  System.out.println(machine_obj.getColumn());
        
        
        
        
         
      /// File Writing
        // Accept a string  
        String str =    "\n\n\t\t MEN: \n" +
                        "\n Training Status: "+ manobj.getTraining() +
                        "\n Communication Level: " + manobj.getCommunication() +
                        "\n Housekeeping Status: " + manobj.getHousekeeping() +
                        "\n Individual Skill: " + manobj.getIndividualskill() +
                        "\n\n\t\t Materials: \n" +
                        "\n Purity Level: " + matobj.getPurity() +
                        "\n Grade: " + matobj.getGrade() +
                        "\n Sampling: " + matobj.getSampling() +
                        "\n Storage Capacity: " + matobj.getStorage() +
                        "\n\n\t\t Methods: \n" +
                        "\n Mobile Phase: " + method_obj.getMobile_phase() +
                        "\n Injection Volume: " + method_obj.getInjection_volume() +
                        "\n Buffer Strength: " + method_obj.getBuffer_strength() +
                        "\n Temperature: " + method_obj.getTemperature() +
                        "\n Flow Rate: " + method_obj.getFlow_rate() +
                        "\n PH: " +method_obj.getPH() +
                        "\n\n\t\t Measurements: \n" +
                        "\n Sensitivity: " + measure_obj.getSensitivity() +
                        "\n Sampling Rate: " + measure_obj.getSampling_rate() +
                        "\n Integration: " + measure_obj.getIntegration() +
                        "\n Reporting: " + measure_obj.getReporting() +
                        "\n\n\t\t Milieu: \n" +
                        "\n Contamination: " + milieu_obj.getContamination() +
                        "\n Temperature: " + milieu_obj.getTemperature() +
                        "\n Humidity: " + milieu_obj.getHumidity() +
                        "\n Light: " + milieu_obj.getLight() +
                        "\n\n\t\t Machines: \n" +
                        "\n Detector: " + machine_obj.getDetector() +
                        "\n Auto Sampler: " +machine_obj.getAuto_sampler() +
                        "\n Injector: " +machine_obj.getInjector() +
                        "\n Oven: " +machine_obj.getOven() +
                        "\n Column: " + machine_obj.getColumn() + "\n"; 
  
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("output.txt"); 
  
        // read character wise from string and write  
        // into FileWriter  
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        System.out.println("\n\t File Updated"); 
        //close the file  
        fw.close(); 
     
        
        
      /// File Reading
        // variable declaration 
        int ch; 
  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("output.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
  
        // close the file 
        fr.close(); 
    }
    
}
