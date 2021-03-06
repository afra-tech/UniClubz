package com.example.cse486.uniclubz.Model.entity;

public class Donation {
    String patient;
    String hospital;
    String address;
    String contactname;
    String contact;
    String date;
    String bgroup;
    String buid;
    String donor;

    public Donation(String patient, String hospital, String address, String contactname, String contact, String date, String bgroup) {
        this.patient = patient;
        this.hospital = hospital;
        this.address = address;
        this.contactname = contactname;
        this.contact = contact;
        this.date = date;
        this.bgroup = bgroup;
        this.donor ="";
    }

    public Donation()
    {

    }

    public Donation(String patient, String hospital, String address, String contactname, String contact, String date, String bgroup, String buid, String donor) {
        this.patient = patient;
        this.hospital = hospital;
        this.address = address;
        this.contactname = contactname;
        this.contact = contact;
        this.date = date;
        this.bgroup = bgroup;
        this.buid = buid;
        this.donor = donor;
    }

    public String getBuid() {
        return buid;
    }

    public void setBuid(String buid) {
        this.buid = buid;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBgroup() {
        return bgroup;
    }

    public void setBgroup(String bgroup) {
        this.bgroup = bgroup;
    }
}
