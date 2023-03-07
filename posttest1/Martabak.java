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

public class Martabak {
   public String jenis;
   public String rasa;
    public int harga;
    
    public Martabak (String jenis,String rasa, int harga){
        this.jenis = jenis;
        this.rasa = rasa;
        this.harga = harga;        
    }
    
    public void setjenis (String jenis){
        this.jenis = jenis;
    }
     public void setrasa (String rasa){
        this.rasa = rasa;
    }
      public void setharga (int harga){
        this.harga = harga;
    }
      
      public void display(){
          System.out.println("Jenis :  " + this.jenis );
          System.out.println("rasa : " + this.rasa);
          System.out.println("harga: " + this.harga);
      }
}


    