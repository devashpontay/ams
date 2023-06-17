/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ams.features.RoomDisabler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ashley Pontay
 */
public class RoomChecker {

    public ArrayList<String> occupiedRoom = new ArrayList<>();
    public  ArrayList<String> getOccupiedRoomFloorOne() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("TenantsDB.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("/");
                if(data[6].equals("1")) {
                    occupiedRoom.add(data[7]);
                }
            }
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return occupiedRoom;
    }

//    public static int[] getOccupiedRoomFloorTwo() {
//
//    }
//
//    public static int[] getOccupiedRoomFloorThree() {
//
//    }
}
