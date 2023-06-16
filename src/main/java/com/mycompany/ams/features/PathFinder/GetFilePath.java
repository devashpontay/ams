/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ams.features.PathFinder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Ashley Pontay
 */
public class GetFilePath {

    public static Icon getFilePath(String fileName) {
        String projectDirectory = System.getProperty("user.dir");
        String filePath = projectDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator + "mycompany" + File.separator + "ams" + File.separator + "resources" + File.separator + fileName + ".png";
        ImageIcon finalIcon = new ImageIcon();
        File file = new File(filePath);
        if (file.exists()) {
            try {
                URL iconURL = file.toURI().toURL();
                ImageIcon icon = new ImageIcon(iconURL);

                finalIcon = icon;

                // Add the label to your GUI or perform any other necessary operations
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist.");
        }
        return finalIcon;
    }

}
