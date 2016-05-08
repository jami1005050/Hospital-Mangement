/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.*;
import java.util.Random;

/**
 *
 * @author Raiyan
 */
public class PatientEntity extends AdministratorEntity {
    public String password;
    public PatientEntity(String f, String l, String fth, String mail, String add, int phone, File ph) {
        super(f,l,fth,mail,add,null,phone,ph);
    }
    
    public void generatePassword() {
        Random random = new Random();
        random.setSeed(phone_no);
        password = random.nextInt(1000000000)+"";
    }
    
    public String generateSummary() {
        String summary="";
        summary = summary.concat("\tEmployee Profile Information\n***CONFIDENTIAL***\n\n");
        summary = summary.concat("Name:\t"+fname+" "+lname+"\nEmail:\t"+email+"\n");
        summary = summary.concat("ID:\t"+phone_no+"\nPassword:\t"+password+"\n");
        return summary;
    }
}
