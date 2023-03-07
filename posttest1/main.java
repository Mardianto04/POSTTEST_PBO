/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;
import com.sun.source.tree.BreakTree;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */

public class main {
    public static void main(String[] args) throws IOException {
        // Array list isinya bisa campuran int string
        ArrayList <Martabak> kedai = new ArrayList<>();

        String jenis;
        String rasa;
        int harga;
        

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.println("[1] tambah jenis martabak");
            System.out.println("[2] lihat menu ");
            System.out.println("[3] Ubah jenis");
            System.out.println("[4] hapus martabak");
            System.out.println("[5] Exit\n");

            System.out.print("Masukkan Pilihan: ");
            int menu = Integer.parseInt(br.readLine());
            if (menu == 1) {
                // CREATE
                System.out.print("Masukkan jenis: ");
                jenis = br.readLine();
                System.out.print("Masukkan Rasa: ");
                rasa = br.readLine();
                System.out.print("Masukkan harga: ");
                harga = Integer.parseInt(br.readLine());
  
                
                Martabak tokoMartabak = new Martabak (jenis,rasa,harga);
                kedai.add(tokoMartabak);
                System.out.println("");
        
                

            } else if (menu == 2) {
                // READ
                for (int i = 0; i < kedai.size(); i++) {
                    System.out.println("No. " + (i+1));
                    kedai.get(i).display();
                }
            } else if (menu == 3) {   
                System.out.println("rasa: "); 
                String Ubah = br.readLine();
                for (Martabak terangbulan : kedai){
                    if(terangbulan.rasa.equals(Ubah)){
                        System.out.println(" Masukkan jenis martabak : "); 
                        terangbulan.setjenis(br.readLine());
                        System.out.println(" Masukkan rasa martabak : "); 
                        terangbulan.setrasa(br.readLine());
                        System.out.println(" Masukkan harga martabak : "); 
                        terangbulan.setharga(Integer.parseInt(br.readLine()));
                    }
                }
            
            } else if (menu == 4) {
                System.out.println("masukkan menu yang ingin di hapus :");
                String ubah = br.readLine();
                for (int k = 0; k < kedai.size(); k++){
                    if ((kedai.get(k).rasa.equals(ubah))){
                        kedai.remove(k);
                        
                    }
                }
                
            } else if(menu == 5){
                System.out.print("terimakasih");
                break;
            }else {
                System.out.println("Masukkin yang benner!");
            }
        }
    }
}