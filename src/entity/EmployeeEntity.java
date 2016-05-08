/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.File;
import java.util.Random;

/**
 *
 * @author Raiyan
 */
public class EmployeeEntity extends AdministratorEntity {
    public String password, designation;
    public EmployeeEntity(String f, String l, String fth, String mail, String add, String acad, int phone, File ph) {
        super(f,l,fth,mail,add,acad,phone,ph);
    }
    
    public void generatePassword() {
        Random random = new Random();
        random.setSeed(phone_no);
        password = random.nextInt(1000000000)+"";
    }
    
    public String generateSummary() {
        String summary="";
        summary = summary.concat("Employee Profile Information\n***CONFIDENTIAL***\n\n");
        summary = summary.concat("Name:\t"+fname+" "+lname+"\nEmail:\t"+email+"\n");
        summary = summary.concat("ID:\t"+phone_no+"\nPassword:\t"+password+"\n");
        return summary;
    }
}
