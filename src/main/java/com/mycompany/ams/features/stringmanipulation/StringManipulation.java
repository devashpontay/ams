/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ams.features.stringmanipulation;

/**
 *
 * @author Ashley Pontay
 */
public class StringManipulation {

    private final int key = 5;

    public String encrypt(String data) {
        
        char[] chars = data.toCharArray();
        String encryptedData = "";
        for(char c : chars) {
            encryptedData += c += key;
        }
        
        return encryptedData;
    }

    public String decrypt(String data) {
        
        char[] chars = data.toCharArray();
        String decryptedData = "";
        for(char c : chars) {
            decryptedData += c -= key;
        }
        
        return decryptedData;
    }
    

}
