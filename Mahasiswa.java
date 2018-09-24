/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectSerial;

import java.io.Serializable;
/**
 *
 * @author SUBARI
 */
public class Mahasiswa implements Serializable {
    
    private String nim;
    private String nama;
    private String asal;
    private String kelas;
    
    public Mahasiswa(String nim, String nama, String asal, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
        this.kelas = kelas;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String Nama){
        this.nama = nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String Nim){
        this.nim = nim;
    }
    
    public String getAsal(){
        return asal;
    }
    
    public void setAsal(String Asal){
        this.nama = nama;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String Kelas){
        this.kelas = kelas;
    }
    
    public void cetakData(){
        System.out.println("Nim : " + getNim());
        System.out.println("Nama : " + getNama());
        System.out.println("Asal : " + getAsal());
        System.out.println("Kelas : " + getKelas());
    }
    
    @Override
    public String toString(){
        return nim + " " + nama + " " + asal + " " + kelas + "\n"; 
    }
}
