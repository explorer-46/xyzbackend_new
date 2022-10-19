package com.nestdigital.xyzbackendappnew.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class StudentModel {
    @Id
    @GeneratedValue
    public int id;
    public int rollno;
    public int addno;
    public String college;
    public String dept;
    public String blood;
    public String dob;
    public String address;
    public String pname;
    public String pemail;
    public String gname;

    public StudentModel(int id, int rollno, int addno, String college, String dept, String blood, String dob, String address, String pname, String pemail, String gname) {
        this.id = id;
        this.rollno = rollno;
        this.addno = addno;
        this.college = college;
        this.dept = dept;
        this.blood = blood;
        this.dob = dob;
        this.address = address;
        this.pname = pname;
        this.pemail = pemail;
        this.gname = gname;
    }

    public StudentModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAddno() {
        return addno;
    }

    public void setAddno(int addno) {
        this.addno = addno;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }
}
