package com.api.book.bootrestbook.Controllers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Teacher")
public class Teacher {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Teacher_Id")
    private int tid;
    @Column(name = "Name")
    private String name;
    @Column(name = "Subject")
    private String subject;
    @Column(name = "salary")
    private int salary;
    @Column(name = "holiday")
    private int holiday;
    @Column(name = "workingday")
    private int workingday;
    @Column(name = "totalclass")
    private int totalclass;

    
    public Teacher() {
    }


    public Teacher(int tid, String name, String subject, int salary, int holiday, int workingday, int totalclass) {
        this.tid = tid;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.holiday = holiday;
        this.workingday = workingday;
        this.totalclass = totalclass;
    }


    public int getTid() {
        return tid;
    }


    public void setTid(int tid) {
        this.tid = tid;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getHoliday() {
        return holiday;
    }


    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }


    public int getWorkingday() {
        return workingday;
    }


    public void setWorkingday(int workingday) {
        this.workingday = workingday;
    }


    public int getTotalclass() {
        return totalclass;
    }


    public void setTotalclass(int totalclass) {
        this.totalclass = totalclass;
    }


    @Override
    public String toString() {
        return "Teacher [holiday=" + holiday + ", name=" + name + ", salary=" + salary + ", subject=" + subject
                + ", tid=" + tid + ", totalclass=" + totalclass + ", workingday=" + workingday + "]";
    }
    
    
    

}
