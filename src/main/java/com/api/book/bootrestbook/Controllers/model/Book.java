package com.api.book.bootrestbook.Controllers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_ID")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Class")
    private String sclass;
    @Column(name = "math")
    private int math;
    @Column(name = "science")
    private int science;
    @Column(name = "Hindi")
    private int hindi;
    @Column(name = "English")
    private int english;
    @Column(name = "history")
    private int history;
    @Column(name = "sum")
    private int sum;
    @Column(name = "percentage")
    private int percentage;
    @Column(name = "attendence")
    private int attendence;

    public Book(int id, String name, String sclass, int math, int science, int hindi, int english, int history, int sum,
            int percentage, int attendence) {
        this.id = id;
        this.name = name;
        this.sclass = sclass;
        this.math = math;
        this.science = science;
        this.hindi = hindi;
        this.english = english;
        this.history = history;
        this.sum = sum;
        this.percentage = percentage;
        this.attendence = attendence;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getSum() {
        sum = math + science + hindi + history + english;
        return sum;
    }

    public void setSum(int sum) {
        sum = math + science + hindi + history + english;
       this.sum = sum;
    }

    public int getPercentage() {
        percentage = (sum * 100) / 500;
        return percentage;
    }
    
    public void setPercentage(int percentage) {
        percentage = (sum * 100) / 500;
        this.percentage = percentage;
    }

    public int getAttendence() {
        return attendence;
    }

    public void setAttendence(int attendence) {
        this.attendence = attendence;
    }

    @Override
    public String toString() {
        return "Book [attendence=" + attendence + ", english=" + english + ", hindi=" + hindi + ", history=" + history
                + ", id=" + id + ", math=" + math + ", name=" + name + ", percentage=" + percentage + ", science="
                + science + ", sclass=" + sclass + ", sum=" + sum + "]";
    }

    

}
