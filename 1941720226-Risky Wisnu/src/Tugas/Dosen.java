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
public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int tarif_SKS = 100000 ;
    
    public Dosen(){
        
    }
    public Dosen (String nip,String nama, String alamat){
        super(nip,nama,alamat);
    }
    public void setSKS(int SKS){
        this.jumlahSKS = SKS;
    }
    public int getGaji(){
        int ttlGaji = jumlahSKS*tarif_SKS;
        return ttlGaji+super.getGaji();
    }
}