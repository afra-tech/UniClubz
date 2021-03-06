package com.example.cse486.uniclubz.Model.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Event implements Serializable {
    private String ename;
    private String eclub;
    private String estatus;
    private String euni;
    private String edesc;
    private String edate;
    private ArrayList<String> attendees;
    private String euid;
    public Event()
    {

    }

    public Event(String ename, String eclub, String estatus, String euni, String edesc, String edate) {
        this.ename = ename;
        this.eclub = eclub;
        this.estatus = estatus;
        this.euni = euni;
        this.edesc = edesc;
        this.edate = edate;

    }

    public Event(String ename, String eclub, String estatus, String euni, String edesc, String edate, ArrayList<String> attendees, String euid) {
        this.ename = ename;
        this.eclub = eclub;
        this.estatus = estatus;
        this.euni = euni;
        this.edesc = edesc;
        this.edate = edate;
        this.attendees = attendees;
        this.euid = euid;
    }

    public String getEuid() {
        return euid;
    }

    public void setEuid(String euid) {
        this.euid = euid;
    }

    public ArrayList<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(ArrayList<String> attendees) {
        this.attendees = attendees;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEclub() {
        return eclub;
    }

    public void setEclub(String eclub) {
        this.eclub = eclub;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getEuni() {
        return euni;
    }

    public void setEuni(String euni) {
        this.euni = euni;
    }

    public String getEdesc() {
        return edesc;
    }

    public void setEdesc(String edesc) {
        this.edesc = edesc;
    }
}
