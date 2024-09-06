/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai02;

import Bai01.SanPham;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SanPham> ds;
       
        try {
            
            FileInputStream fis = new FileInputStream("sanpham.bin");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                ds = (ArrayList<SanPham>) ois.readObject();
            }

           
            System.out.println("Da doc xong");
            for (SanPham sp : ds) {
                System.out.println(sp);
            }

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Ghi File that bai");
        }
        
    }
    
}