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
public class TugasMain {
    public static void main(String[] args) {
        Dosen dos = new Dosen();
        dos.setNama("Risky");
        dos.setSKS(8);
        
        Pegawai pgw = new Pegawai();
        pgw.setNama("Wisnu");
        
        DaftarGaji gaji = new DaftarGaji(2);
        gaji.addPegawai(pgw);
        gaji.addPegawai(dos);
        gaji.printSemuaGaji();
    }
}
