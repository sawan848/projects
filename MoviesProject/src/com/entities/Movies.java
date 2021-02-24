package com.entities;

/*
 * @author:Saawan
 * @created:[2/23/2021],Tuesday
 * Time:4:54 PM
 */
public class Movies {

    private int sno;
    private int year;
    private String name;

    public Movies(){

    }
    public Movies(int year,String name){
        this.year=year;
        this.name=name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int s_no) {
        this.sno = s_no;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
