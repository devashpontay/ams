/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ams.features.data_struct;

/**
 *
 * @author Ashley Pontay
 */
public class MyLinkedList {
    
    public Node head;
    
    public MyLinkedList() {
        this.head = null;
    }
    
    public void add(String idNo, String fullname, String contactNo, String email, int balance, int securityDeposit, int floorNo, int unitNo) {
        Node newNode = new Node(idNo, fullname, contactNo, email, balance, securityDeposit, floorNo, unitNo);
        
        if(head == null) {
            head = newNode;
        }else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode.next = newNode;
            }
            currentNode.next = newNode;
        }
    }
    
    
    public void display() {
    Node currentNode = head;
    while (currentNode != null) {
        System.out.println("ID No: " + currentNode.idNo);
        System.out.println("Full Name: " + currentNode.fullname);
        System.out.println("Contact No: " + currentNode.contactNo);
        System.out.println("Email: " + currentNode.email);
        System.out.println("Balance: " + currentNode.balance);
        System.out.println("Security Deposit: " + currentNode.securityDeposit);
        System.out.println("Floor No: " + currentNode.floorNo);
        System.out.println("Unit No: " + currentNode.unitNo);
        System.out.println("------------------------");

        currentNode = currentNode.next;
    }
}

    
    
    
}
