/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Risky
 */
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jmlPegawai = 0;
    
    public DaftarGaji(int jumlahPegawai){
        listPegawai = new Pegawai[jumlahPegawai];
    }
    public void addPegawai(Pegawai p){
        listPegawai[jmlPegawai] = p;
        jmlPegawai++;
    }
    public void printSemuaGaji(){
        for(int i=0;i<jmlPegawai;i++){
            System.out.printf(listPegawai[i].getNama()+" Memperoleh Gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
