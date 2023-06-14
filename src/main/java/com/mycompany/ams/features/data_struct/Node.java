/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ams.features.data_struct;

/**
 *
 * @author Ashley Pontay
 */
public class Node {
    String idNo;
    String fullname;
    String contactNo;
    String email;
    int balance;
    int securityDeposit;
    int floorNo;
    int unitNo;
    public Node next;
    
    public Node(String idNo, String fullname, String contactNo, String email, int balance, int securityDeposit, int floorNo, int unitNo) {
        this.idNo = idNo;
        this.fullname = fullname;
        this.contactNo = contactNo;
        this.email = email;
        this.balance = balance;
        this.securityDeposit = securityDeposit;
        this.floorNo = floorNo;
        this.unitNo = unitNo;
        this.next = null;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(int securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(int unitNo) {
        this.unitNo = unitNo;
    }
    
}
