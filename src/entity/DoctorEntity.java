/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.File;

/**
 *
 * @author Raiyan
 */
public class DoctorEntity extends AdministratorEntity {
    public String designation;
    public DoctorEntity(String f, String l, String fth, String mail, String add, String acad, int phone, File ph) {
        super(f,l,fth,mail,add,acad,phone,ph);
    }
    
    public String generateSummary() {
        String summary="";
        summary = summary.concat("Doctor Profile Information\n***CONFIDENTIAL***\n\n");
        summary = summary.concat("Name:\t"+fname+" "+lname+"\nEmail:\t"+email+"\n");
        summary = summary.concat("ID:\t"+phone_no+"\nKey 1:\t"+key1+"\nKey 2:\t"+key2);
        return summary;
    }
}
