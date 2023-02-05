package com.example.restaurant.model;
public class Restaumodel {
    private int restauUID;
    private String restauName;
    private String restauAdd;
    private int contNumber;
    private String speciality;
    private int totalStaff;
    public Restaumodel() {
    }
    public Restaumodel(int restauUID, String restauName, String restauAdd, int contNumber, String speciality, int totalStaff) {
        this.restauUID = restauUID;
        this.restauName = restauName;
        this.restauAdd = restauAdd;
        this.contNumber = contNumber;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
    }

    public int getRestauUID() {
        return restauUID;
    }

    public void setRestauUID(int restauUID) {
        this.restauUID = restauUID;
    }

    public String getRestauName() {
        return restauName;
    }

    public void setRestauName(String restauName) {
        this.restauName = restauName;
    }

    public String getRestauAdd() {
        return restauAdd;
    }

    public void setRestauAdd(String restauAdd) {
        this.restauAdd = restauAdd;
    }

    public int getContNumber() {
        return contNumber;
    }

    public void setContNumber(int contNumber) {
        this.contNumber = contNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }


}
