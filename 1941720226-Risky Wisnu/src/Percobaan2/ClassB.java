/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author Risky
 */
public class ClassB extends ClassA{
    private int z;
    
    public void setZ(int z){
        this.z = z;
    }
    public int getZ(){
        return z;
    }
    public void getNilaiZ(){
        System.out.println("Nilai z : " + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah : "+(getX()+ getY()+z));
    }
}
