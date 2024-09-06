/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai02;


import Bai01.SanPham;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos=new FileOutputStream("sanpham.bin");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thong tin san pham thu " + (i + 1));
                    System.out.print("Nhap ma so san pham: ");
                    String maso = sc.nextLine();
                    System.out.print("Nhap ten san pham: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap gia san pham: ");
                    float gia = sc.nextFloat();
                    sc.nextLine();
                    SanPham sp = new SanPham(maso, ten, gia);
                    ds.add(sp);
                }
                oos.writeObject(ds);
            }
            System.out.println("Da ghi xong");
        } catch (IOException ex) {
            System.out.println("Loi xay ra:" + ex.toString());
            System.out.println("Ghi File that bai");
        }
    }

}