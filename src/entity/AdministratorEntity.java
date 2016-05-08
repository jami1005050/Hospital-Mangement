/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;
import java.io.*;
import java.util.*;
/**
 *
 * @author Raiyan
 */
public class AdministratorEntity {
    public String fname, lname, fthr_name,email, address, academic, key1, key2;
    public int phone_no;
    public File photo;
    public byte[] image;
    
    public AdministratorEntity(String f, String l, String fth, String mail, String add, String acad, int phone, File ph) {
        fname = f;
        lname = l;
        fthr_name = fth;
        email = mail;
        address = add;
        academic = acad;
        phone_no = phone;
        photo = ph;
    }
    
    public void generateKeys() {
        Random random = new Random();
        random.setSeed(phone_no);
        key1 = random.nextInt(1000000000)+"";
        key2 = random.nextInt(1000000000)+"";
    }
    
    public String generateSummary() {
        String summary="";
        summary = summary.concat("Administrator Profile Information\n***CONFIDENTIAL***\n");
        summary = summary.concat("Name:\t"+fname+" "+lname+"\nEmail:\t"+email+"\n");
        summary = summary.concat("ID:\t"+phone_no+"\nKey 1:\t"+key1+"\nKey 2:\t"+key2);
        return summary;
    }
    
}
